import React, { useEffect, useState } from 'react';
import axios from 'axios';
import Formulario from './Formulario.jsx';
import Eliminacion from "./Eliminacion.jsx"

const Listado = () => {
    const [products, setProducts] = useState([]);
    const [selectedProduct, setSelectedProduct] = useState(null);
    const [showForm, setShowForm] = useState(false);
    const [showDeleteModal, setShowDeleteModal] = useState(false); // Estado para mostrar el modal de eliminación

    useEffect(() => {
        refreshProducts();
    }, []);

    const refreshProducts = () => {
        axios.get('/api/productos').then(response => {
            setProducts(response.data);
        });
    };

    const handleDelete = (productId) => {
        axios.delete(`/api/productos/${productId}`).then(() => {
            refreshProducts();
            setShowDeleteModal(false); // Ocultar modal después de eliminar
        });
    };

    return (
        <div>
            <button onClick={() => { setSelectedProduct(null); setShowForm(true); }}>Agregar Producto</button>
            {showForm && <Formulario productId={selectedProduct} onClose={() => setShowForm(false)} refreshProducts={refreshProducts} />}
            <table>
                <h2>Listado de Productos</h2>
                <tbody>
                    {products.map(product => (
                        <tr key={product.id}>
                            <td>{product.name}</td>
                            <td>{product.description}</td>
                            <td>{product.price}</td>
                            <td>
                                <button onClick={() => { setSelectedProduct(product.id); setShowForm(true); }}>Editar</button>
                                <button onClick={() => { setSelectedProduct(product); setShowDeleteModal(true); }}>Eliminar</button>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
            {showDeleteModal && (
                <Eliminacion 
                    product={selectedProduct} 
                    onConfirm={handleDelete} 
                    onCancel={() => setShowDeleteModal(false)} 
                />
            )}
        </div>
    );
};

export default Listado;
