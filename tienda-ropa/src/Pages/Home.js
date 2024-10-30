// src/pages/Home.js
import React from 'react';
import { Link } from 'react-router-dom';

const Home = () => {
  return (
    <div>
      <h1>Bienvenido al Dashboard</h1>
      <p>Selecciona una opción:</p>
      <Link to="/productos">Gestión de Productos</Link>
    </div>
  );
};

export default Home;
