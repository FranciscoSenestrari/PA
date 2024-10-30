// src/App.js
import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import ProductosMan from './Pages/ProductosMan';
import Home from './Pages/Home'; // Supón que esta es otra página principal

const App = () => {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Home />} /> {/* Página principal */}
        <Route path="/productos" element={<ProductosMan />} /> {/* Gestión de productos */}
      </Routes>
    </Router>
  );
};

export default App;
