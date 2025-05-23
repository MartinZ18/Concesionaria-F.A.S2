function inicio_pagina_formulario(){

}

//Para el formulario de vehiculo - Formulario 1 - F1
document.getElementById("formulario_vehiculo").addEventListener('submit', function(e) {
    e.preventDefault();

    const objeto = {}; //objeto / diccionario que contiene los datos del formulario
    let operacion_exitosa = true;
    const mensajes_de_error = {};

    const f_modelo = document.getElementById("F1_modelo");
    if(f_modelo){
        objeto["F1_modelo"] = f_modelo.value;
    }else{
        operacion_exitosa = false;
        mensajes_de_error["F1_modelo"] = "Debe especificar el modelo";
    }

    const f_version = document.getElementById("F1_version");
    if(f_version){
        objeto["F1_version"] = f_version.value;
    }else{
        operacion_exitosa = false;
        mensajes_de_error["F1_version"] = "Debe especificar la versión";
    }

    const f_proveedor = document.getElementById("F1_proveedor");
    if(f_proveedor){
        objeto["F1_proveedor"] = f_proveedor.value;
    }else{
        operacion_exitosa = false;
        mensajes_de_error["F1_proveedor"] = "El proveedor es requerido";
    }

    const f_matricula = document.getElementById("F1_matricula");
    if(f_matricula){
        objeto["F1_matricula"] = f_matricula.value;
    }

    const f_precio = document.getElementById("F1_precio");
    if(f_precio){
        objeto["F1_precio"] = f_precio.value;
    }else{
        operacion_exitosa = false;
        mensajes_de_error["F1_precio"] = "El precio es requerido";
    }

    const f_color = document.getElementById("F1_color");
    if(f_color){
        objeto["F1_color"] = f_color.value;
    }else{
        operacion_exitosa = false;
        mensajes_de_error["F1_color"] = "El color es requerido";
    }

    const f_anio = document.getElementById("F1_anio");
    if(f_anio){
        objeto["F1_anio"] = f_anio.value;
    }else{
        operacion_exitosa = false;
        mensajes_de_error["F1_anio"] = "El año es requerido";
    }

    const f_serie = document.getElementById("F1_serie");
    if(f_serie){
        objeto["F1_serie"] = f_serie.value;
    }else{
        operacion_exitosa = false;
        mensajes_de_error["F1_serie"] = "El nro de serie es requerido";
    }

    const f_kilometraje = document.getElementById("F1_kilometraje");
    if(f_kilometraje){
        objeto["F1_kilometraje"] = f_kilometraje.value;
    }else{
        operacion_exitosa = false;
        mensajes_de_error["F1_kilometraje"] = "El kilometraje es requerido";
    }

    const f_estado = document.getElementById("F1_estado");
    if(f_estado){
        objeto["F1_estado"] = f_estado.value;
    }else{
        operacion_exitosa = false;
        mensajes_de_error["F1_estado"] = "Debe indicar el estado del vehículo";
    }

    var extensionesValidas = /(\.jpg|\.jpeg|\.png)$/i;

    const f_imagen = document.getElementById("F1_imagen");
    if(f_imagen){
        if(!extensionesValidas.exec(f_imagen.value)){
            operacion_exitosa = false;
            mensajes_de_error["F1_imagen"] = "El formato de la imagen debe ser .jpg, .jpeg o .png";
        }else{
            objeto["F1_imagen"] = f_imagen.value;
        }
    }else{
        operacion_exitosa = false;
        mensajes_de_error["F1_imagen"] = "Debe subir una imágen";
    }

    if(operacion_exitosa){
        // Aquí puedes hacer un POST a tu backend si estás usando Spring Boot
        // Ahora el backend debería verificar los datos y guardarlos en la base de datos si están correctos
        //Si hay algun error, se debe notificar 
        alert('Vehículo cargado correctamente');
    }else{
        alert("Campos inválidos o incompletos");
        return;
    }

});
