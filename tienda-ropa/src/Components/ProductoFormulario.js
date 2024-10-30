// src/components/ProductForm.js
import React from 'react';
import { useFormik } from 'formik';
import * as Yup from 'yup';

const ProductoFormulario = ({ onSubmit, initialValues, isEditMode }) => {
  const formik = useFormik({
    initialValues: initialValues || {
      name: '',
      description: '',
      category: '',
      subcategory: '',
      price: 0,
      sku: '',
      stock: 0,
      brand: '',
      variant: '',
      image: null,
    },
    validationSchema: Yup.object({
      name: Yup.string().required('Nombre es requerido'),
      description: Yup.string().required('Descripción es requerida'),
      category: Yup.string().required('Categoría es requerida'),
      price: Yup.number().positive('El precio debe ser positivo').required('Precio es requerido'),
      sku: Yup.string().required('SKU es requerido'),
      stock: Yup.number().positive('El stock debe ser positivo').required('Stock es requerido'),
      brand: Yup.string().required('Marca es requerida'),
    }),
    onSubmit: (values) => {
      onSubmit(values);
    },
  });

  return (
    <form onSubmit={formik.handleSubmit}>
      <input type="text" name="name" placeholder="Nombre" value={formik.values.name} onChange={formik.handleChange} />
      {formik.errors.name ? <div>{formik.errors.name}</div> : null}

      <textarea name="description" placeholder="Descripción" value={formik.values.description} onChange={formik.handleChange} />
      {formik.errors.description ? <div>{formik.errors.description}</div> : null}

      <input type="text" name="category" placeholder="Categoría" value={formik.values.category} onChange={formik.handleChange} />
      {formik.errors.category ? <div>{formik.errors.category}</div> : null}

      <input type="text" name="subcategory" placeholder="Subcategoría" value={formik.values.subcategory} onChange={formik.handleChange} />

      <input type="number" name="price" placeholder="Precio" value={formik.values.price} onChange={formik.handleChange} />
      {formik.errors.price ? <div>{formik.errors.price}</div> : null}

      <input type="text" name="sku" placeholder="SKU" value={formik.values.sku} onChange={formik.handleChange} />
      {formik.errors.sku ? <div>{formik.errors.sku}</div> : null}

      <input type="number" name="stock" placeholder="Stock" value={formik.values.stock} onChange={formik.handleChange} />
      {formik.errors.stock ? <div>{formik.errors.stock}</div> : null}

      <input type="text" name="brand" placeholder="Marca" value={formik.values.brand} onChange={formik.handleChange} />
      {formik.errors.brand ? <div>{formik.errors.brand}</div> : null}

      <input type="text" name="variant" placeholder="Variante" value={formik.values.variant} onChange={formik.handleChange} />

      <input type="file" name="image" onChange={(e) => formik.setFieldValue('image', e.target.files[0])} />
      {formik.errors.image ? <div>{formik.errors.image}</div> : null}

      <button type="submit">{isEditMode ? 'Actualizar' : 'Agregar'} Producto</button>
    </form>
  );
};

export default ProductoFormulario;
