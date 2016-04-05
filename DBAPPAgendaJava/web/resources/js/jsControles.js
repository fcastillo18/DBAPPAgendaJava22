/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*Esta linea es para ejecutar una function de javascript
*dentro de la function escribimos el nombre (id)del formulario en el archivo xhtml de la app
*hay que importar esta function en el diseño o layaout, preferiblemente en el general con la siguient linea:
*<h:outputScript library="js" name="jsControles.js"
*/
function limpiarForm(idFormulario)
{
    document.getElementById(idFormulario).reset();
}
