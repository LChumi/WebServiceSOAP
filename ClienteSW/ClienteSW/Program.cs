using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClienteSW
{
    internal class Program
    {
        static void Main(string[] args)
        {
            ServicioWebNet.WSOperacionesClient cliente= new ServicioWebNet.WSOperacionesClient();
            // metodos 
            //loguin
            if (cliente.loguin("LChumi", "chumi123"))
            {
                Console.WriteLine("Acceso correcto");
            }
            else
            {
                Console.WriteLine("Acceso denegado");
            }
            //cerrar secion 
            cliente.Close();
            Console.ReadKey();
        }
    }
}
