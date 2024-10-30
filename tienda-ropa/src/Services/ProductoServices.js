// src/services/productService.js
import axios from 'axios';

const API_URL = 'https://api/productos'; // Cambia por tu URL

export const getProducts = async () => axios.get(API_URL);
export const createProduct = async (productData) => axios.post(API_URL, productData);
export const updateProduct = async (id, productData) => axios.put(`${API_URL}/${id}`, productData);
export const deleteProduct = async (id) => axios.delete(`${API_URL}/${id}`);
