// src/components/ProductList.js
import React from 'react';

const ProductoListado = ({ producto, onEdit, onDelete }) => (
  <ul>
    {producto.map((product) => (
      <li key={product.id}>
        <h3>{producto.name}</h3>
        <p>{producto.description}</p>
        <p>Precio: ${producto.price}</p>
        <button onClick={() => onEdit(producto)}>Editar</button>
        <button onClick={() => onDelete(producto.id)}>Eliminar</button>
      </li>
    ))}
  </ul>
);

export default ProductoListado;
