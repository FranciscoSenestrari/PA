import React from 'react';
import Listado from './Components/Producto/Listado';
import Stock from './Components/Producto/Stock';
import './App.css'; // Asegúrate de tener un archivo CSS para estilos

const App = () => {
    return (
        <div className="App">
            <header>
                <h1>Tienda de Ropa - Gestión Administrativa</h1>
            </header>
            <main>
                <section>
                    <h2>Gestión de Productos</h2>
                    <Listado />
                </section>
                <section>
                    <h2>Gestión de Stock</h2>
                    <Stock />
                </section>
            </main>
        </div>
    );
};

export default App;



