// ProductoService.js
import axios from 'axios';

const API_URL = 'http://localhost:8080/api'; // Cambia la URL según tu configuración

const getProducts = async () => {
    const response = await axios.get(`${API_URL}/products`);
    return response.data;
};

const getProductById = async (id) => {
    const response = await axios.get(`${API_URL}/products/${id}`);
    return response.data;
};

const createProduct = async (productData) => {
    const response = await axios.post(`${API_URL}/products`, productData, {
        headers: {
            'Content-Type': 'multipart/form-data'
        }
    });
    return response.data;
};

const updateProduct = async (id, productData) => {
    const response = await axios.put(`${API_URL}/products/${id}`, productData, {
        headers: {
            'Content-Type': 'multipart/form-data'
        }
    });
    return response.data;
};

const deleteProduct = async (id) => {
    const response = await axios.delete(`${API_URL}/products/${id}`);
    return response.data;
};

const registerStockAdjustment = async (stockData) => {
    const response = await axios.post(`${API_URL}/stock`, stockData);
    return response.data;
};

// Exporta las funciones como una exportación por defecto
export default {
    getProducts,
    getProductById,
    createProduct,
    updateProduct,
    deleteProduct,
    registerStockAdjustment
};
