package NAE;

/***********************************************************************
 * new module that will create state81 module and return it as a string  
 ***********************************************************************/
public class Generator {
	
	static String generate_state()
	{
		StringBuilder states81 = new StringBuilder();
		states81.append("MODULE states81\n"+
        "VAR \n"+
        "    error : boolean ; x1 : { 0 , 1 } ;  x2 : { 0 , 1 } ;  x3 : { 0 , 1 } ;  x4 : { 0 , 1 } ;  x5 : { 0 , 1 } ;  x6 : { 0 , 1 } ;  x7 : { 0 , 1 } ;  x8 : { 0 , 1 } ;  x9 : { 0 , 1 } ;  x10 : { 0 , 1 } ;  x11 : { 0 , 1 } ;  x12 : { 0 , 1 } ;  x13 : { 0 , 1 } ;  x14 : { 0 , 1 } ;  x15 : { 0 , 1 } ;  x16 : { 0 , 1 } ;  x17 : { 0 , 1 } ;  x18 : { 0 , 1 } ;  x19 : { 0 , 1 } ;  x20 : { 0 , 1 } ;  x21 : { 0 , 1 } ;  x22 : { 0 , 1 } ;  x23 : { 0 , 1 } ;  x24 : { 0 , 1 } ;  x25 : { 0 , 1 } ;  x26 : { 0 , 1 } ;  x27 : { 0 , 1 } ;  x28 : { 0 , 1 } ;  x29 : { 0 , 1 } ;  x30 : { 0 , 1 } ;  x31 : { 0 , 1 } ;  x32 : { 0 , 1 } ;  x33 : { 0 , 1 } ;  x34 : { 0 , 1 } ;  x35 : { 0 , 1 } ;  x36 : { 0 , 1 } ;  x37 : { 0 , 1 } ;  x38 : { 0 , 1 } ;  x39 : { 0 , 1 } ;  x40 : { 0 , 1 } ;  x41 : { 0 , 1 } ;  x42 : { 0 , 1 } ;  x43 : { 0 , 1 } ;  x44 : { 0 , 1 } ;  x45 : { 0 , 1 } ;  x46 : { 0 , 1 } ;  x47 : { 0 , 1 } ;  x48 : { 0 , 1 } ;  x49 : { 0 , 1 } ;  x50 : { 0 , 1 } ;  x51 : { 0 , 1 } ;  x52 : { 0 , 1 } ;  x53 : { 0 , 1 } ;  x54 : { 0 , 1 } ;  x55 : { 0 , 1 } ;  x56 : { 0 , 1 } ;  x57 : { 0 , 1 } ;  x58 : { 0 , 1 } ;  x59 : { 0 , 1 } ;  x60 : { 0 , 1 } ;  x61 : { 0 , 1 } ;  x62 : { 0 , 1 } ;  x63 : { 0 , 1 } ;  x64 : { 0 , 1 } ;  x65 : { 0 , 1 } ;  x66 : { 0 , 1 } ;  x67 : { 0 , 1 } ;  x68 : { 0 , 1 } ;  x69 : { 0 , 1 } ;  x70 : { 0 , 1 } ;  x71 : { 0 , 1 } ;  x72 : { 0 , 1 } ;  x73 : { 0 , 1 } ;  x74 : { 0 , 1 } ;  x75 : { 0 , 1 } ;  x76 : { 0 , 1 } ;  x77 : { 0 , 1 } ;  x78 : { 0 , 1 } ;  x79 : { 0 , 1 } ;  x80 : { 0 , 1 } ;  x81 : { 0 , 1 } ; \n"+
		"	X1 : boolean ;  X2 : boolean ;  X3 : boolean ;  X4 : boolean ;  X5 : boolean ;  X6 : boolean ;  X7 : boolean ;  X8 : boolean ;  X9 : boolean ;  X10 : boolean ;  X11 : boolean ;  X12 : boolean ;  X13 : boolean ;  X14 : boolean ;  X15 : boolean ;  X16 : boolean ;  X17 : boolean ;  X18 : boolean ;  X19 : boolean ;  X20 : boolean ;  X21 : boolean ;  X22 : boolean ;  X23 : boolean ;  X24 : boolean ;  X25 : boolean ;  X26 : boolean ;  X27 : boolean ;  X28 : boolean ;  X29 : boolean ;  X30 : boolean ;  X31 : boolean ;  X32 : boolean ;  X33 : boolean ;  X34 : boolean ;  X35 : boolean ;  X36 : boolean ;  X37 : boolean ;  X38 : boolean ;  X39 : boolean ;  X40 : boolean ;  X41 : boolean ;  X42 : boolean ;  X43 : boolean ;  X44 : boolean ;  X45 : boolean ;  X46 : boolean ;  X47 : boolean ;  X48 : boolean ;  X49 : boolean ;  X50 : boolean ;  X51 : boolean ;  X52 : boolean ;  X53 : boolean ;  X54 : boolean ;  X55 : boolean ;  X56 : boolean ;  X57 : boolean ;  X58 : boolean ;  X59 : boolean ;  X60 : boolean ;  X61 : boolean ;  X62 : boolean ;  X63 : boolean ;  X64 : boolean ;  X65 : boolean ;  X66 : boolean ;  X67 : boolean ;  X68 : boolean ;  X69 : boolean ;  X70 : boolean ;  X71 : boolean ;  X72 : boolean ;  X73 : boolean ;  X74 : boolean ;  X75 : boolean ;  X76 : boolean ;  X77 : boolean ;  X78 : boolean ;  X79 : boolean ;  X80 : boolean ;  X81 : boolean ; \n"+

		"ASSIGN\n"+
        "    init ( error ) := FALSE ;\n"+
        "    init ( x1 ) := { 0 , 1 } ; \n"+
        "    init ( x2 ) := { 0 , 1 } ; \n"+
        "    init ( x3 ) := { 0 , 1 } ; \n"+
        "    init ( x4 ) := { 0 , 1 } ; \n"+
        "    init ( x5 ) := { 0 , 1 } ; \n"+
        "    init ( x6 ) := { 0 , 1 } ; \n"+
        "    init ( x7 ) := { 0 , 1 } ; \n"+
        "    init ( x8 ) := { 0 , 1 } ; \n"+
        "    init ( x9 ) := { 0 , 1 } ; \n"+
        "    init ( x10 ) := { 0 , 1 } ; \n"+
        "    init ( x11 ) := { 0 , 1 } ; \n"+
        "    init ( x12 ) := { 0 , 1 } ; \n"+
        "    init ( x13 ) := { 0 , 1 } ; \n"+
        "    init ( x14 ) := { 0 , 1 } ; \n"+
        "    init ( x15 ) := { 0 , 1 } ; \n"+
        "    init ( x16 ) := { 0 , 1 } ; \n"+
        "    init ( x17 ) := { 0 , 1 } ; \n"+
        "    init ( x18 ) := { 0 , 1 } ; \n"+
        "    init ( x19 ) := { 0 , 1 } ; \n"+
        "    init ( x20 ) := { 0 , 1 } ; \n"+
        "    init ( x21 ) := { 0 , 1 } ; \n"+
        "    init ( x22 ) := { 0 , 1 } ; \n"+
        "    init ( x23 ) := { 0 , 1 } ; \n"+
        "    init ( x24 ) := { 0 , 1 } ; \n"+
        "    init ( x25 ) := { 0 , 1 } ; \n"+
        "    init ( x26 ) := { 0 , 1 } ; \n"+
        "    init ( x27 ) := { 0 , 1 } ; \n"+
        "    init ( x28 ) := { 0 , 1 } ; \n"+
        "    init ( x29 ) := { 0 , 1 } ; \n"+
        "    init ( x30 ) := { 0 , 1 } ; \n"+
        "    init ( x31 ) := { 0 , 1 } ; \n"+
        "    init ( x32 ) := { 0 , 1 } ; \n"+
        "    init ( x33 ) := { 0 , 1 } ; \n"+
        "    init ( x34 ) := { 0 , 1 } ; \n"+
        "    init ( x35 ) := { 0 , 1 } ; \n"+
        "    init ( x36 ) := { 0 , 1 } ; \n"+
        "    init ( x37 ) := { 0 , 1 } ; \n"+
        "    init ( x38 ) := { 0 , 1 } ; \n"+
        "    init ( x39 ) := { 0 , 1 } ; \n"+
        "    init ( x40 ) := { 0 , 1 } ; \n"+
        "    init ( x41 ) := { 0 , 1 } ; \n"+
        "    init ( x42 ) := { 0 , 1 } ; \n"+
        "    init ( x43 ) := { 0 , 1 } ; \n"+
        "    init ( x44 ) := { 0 , 1 } ; \n"+
        "    init ( x45 ) := { 0 , 1 } ; \n"+
        "    init ( x46 ) := { 0 , 1 } ; \n"+
        "    init ( x47 ) := { 0 , 1 } ; \n"+
        "    init ( x48 ) := { 0 , 1 } ; \n"+
        "    init ( x49 ) := { 0 , 1 } ; \n"+
        "    init ( x50 ) := { 0 , 1 } ; \n"+
        "    init ( x51 ) := { 0 , 1 } ; \n"+
        "    init ( x52 ) := { 0 , 1 } ; \n"+
        "    init ( x53 ) := { 0 , 1 } ; \n"+
        "    init ( x54 ) := { 0 , 1 } ; \n"+
        "    init ( x55 ) := { 0 , 1 } ; \n"+
        "    init ( x56 ) := { 0 , 1 } ; \n"+
        "    init ( x57 ) := { 0 , 1 } ; \n"+
        "    init ( x58 ) := { 0 , 1 } ; \n"+
        "    init ( x59 ) := { 0 , 1 } ; \n"+
        "    init ( x60 ) := { 0 , 1 } ; \n"+
        "    init ( x61 ) := { 0 , 1 } ; \n"+
        "    init ( x62 ) := { 0 , 1 } ; \n"+
        "    init ( x63 ) := { 0 , 1 } ; \n"+
        "    init ( x64 ) := { 0 , 1 } ; \n"+
        "    init ( x65 ) := { 0 , 1 } ; \n"+
        "    init ( x66 ) := { 0 , 1 } ; \n"+
        "    init ( x67 ) := { 0 , 1 } ; \n"+
        "    init ( x68 ) := { 0 , 1 } ; \n"+
        "    init ( x69 ) := { 0 , 1 } ; \n"+
        "    init ( x70 ) := { 0 , 1 } ; \n"+
        "    init ( x71 ) := { 0 , 1 } ; \n"+
        "    init ( x72 ) := { 0 , 1 } ; \n"+
        "    init ( x73 ) := { 0 , 1 } ; \n"+
        "    init ( x74 ) := { 0 , 1 } ; \n"+
        "    init ( x75 ) := { 0 , 1 } ; \n"+
        "    init ( x76 ) := { 0 , 1 } ; \n"+
        "    init ( x77 ) := { 0 , 1 } ; \n"+
        "    init ( x78 ) := { 0 , 1 } ; \n"+
        "    init ( x79 ) := { 0 , 1 } ; \n"+
        "    init ( x80 ) := { 0 , 1 } ; \n"+
        "    init ( x81 ) := { 0 , 1 } ; \n"+

       "     next ( error ) := case\n"+
        "    x74 > x73 : TRUE ;\n"+
        "    x35 > x53 : TRUE ;\n"+
        "    x8 > x26 : TRUE ;\n"+
        "    x23 > x20 : TRUE ;\n"+
        "    x9 > x6 : TRUE ;\n"+
        "    x80 > x77 : TRUE ;\n"+
        "    x19 > x46 : TRUE ;\n"+
        "    x78 > x77 : TRUE ;\n"+
        "    x2 > x29 : TRUE ;\n"+
        "    x47 > x46 : TRUE ;\n"+
        "    x63 > x61 : TRUE ;\n"+
        "    x44 > x53 : TRUE ;\n"+
        "    x25 > x22 : TRUE ;\n"+
        "    x27 > x24 : TRUE ;\n"+
        "    x21 > x48 : TRUE ;\n"+
        "    x24 > x51 : TRUE ;\n"+
        "    x31 > x28 : TRUE ;\n"+
        "    x20 > x19 : TRUE ;\n"+
        "    x34 > x30 : TRUE ;\n"+
        "    x11 > x10 : TRUE ;\n"+
        "    x79 > x75 : TRUE ;\n"+
        "    x11 > x20 : TRUE ;\n"+
        "    x19 > x73 : TRUE ;\n"+
        "    x2 > x1 : TRUE ;\n"+
        "    x69 > x67 : TRUE ;\n"+
        "    x52 > x49 : TRUE ;\n"+
        "    x8 > x5 : TRUE ;\n"+
        "    x12 > x66 : TRUE ;\n"+
        "    x34 > x61 : TRUE ;\n"+
        "    x26 > x80 : TRUE ;\n"+
        "    x8 > x35 : TRUE ;\n"+
        "    x66 > x64 : TRUE ;\n"+
        "    x36 > x35 : TRUE ;\n"+
        "    x27 > x26 : TRUE ;\n"+
        "    x23 > x77 : TRUE ;\n"+
        "    x71 > x68 : TRUE ;\n"+
        "    x22 > x49 : TRUE ;\n"+
        "    x3 > x57 : TRUE ;\n"+
        "    x54 > x52 : TRUE ;\n"+
        "    x48 > x46 : TRUE ;\n"+
        "    x59 > x56 : TRUE ;\n"+
        "    x24 > x21 : TRUE ;\n"+
        "    x9 > x8 : TRUE ;\n"+
        "    x18 > x45 : TRUE ;\n"+
        "    x50 > x77 : TRUE ;\n"+
        "    x80 > x79 : TRUE ;\n"+
        "    x78 > x75 : TRUE ;\n"+
        "    x63 > x60 : TRUE ;\n"+
        "    x16 > x25 : TRUE ;\n"+
        "    x68 > x77 : TRUE ;\n"+
        "    x70 > x79 : TRUE ;\n"+
        "    x67 > x65 : TRUE ;\n"+
        "    x1 > x10 : TRUE ;\n"+
        "    x15 > x42 : TRUE ;\n"+
        "    x47 > x74 : TRUE ;\n"+
        "    x22 > x58 : TRUE ;\n"+
        "    x8 > x17 : TRUE ;\n"+
        "    x6 > x33 : TRUE ;\n"+
        "    x41 > x38 : TRUE ;\n"+
        "    x61 > x57 : TRUE ;\n"+
        "    x51 > x78 : TRUE ;\n"+
        "    x43 > x40 : TRUE ;\n"+
        "    x40 > x37 : TRUE ;\n"+
        "    x13 > x11 : TRUE ;\n"+
        "    x26 > x23 : TRUE ;\n"+
        "    x72 > x66 : TRUE ;\n"+
        "    x20 > x47 : TRUE ;\n"+
        "    x52 > x46 : TRUE ;\n"+
        "    x58 > x67 : TRUE ;\n"+
        "    x53 > x47 : TRUE ;\n"+
        "    x59 > x58 : TRUE ;\n"+
        "    x32 > x29 : TRUE ;\n"+
        "    x4 > x58 : TRUE ;\n"+
        "    x54 > x48 : TRUE ;\n"+
        "    x32 > x59 : TRUE ;\n"+
        "    x54 > x81 : TRUE ;\n"+
        "    x8 > x62 : TRUE ;\n"+
        "    x79 > x73 : TRUE ;\n"+
        "    x68 > x65 : TRUE ;\n"+
        "    x51 > x50 : TRUE ;\n"+
        "    x22 > x76 : TRUE ;\n"+
        "    x57 > x66 : TRUE ;\n"+
        "    x20 > x56 : TRUE ;\n"+
        "    x81 > x79 : TRUE ;\n"+
        "    x30 > x28 : TRUE ;\n"+
        "    x58 > x76 : TRUE ;\n"+
        "    x8 > x7 : TRUE ;\n"+
        "    x23 > x59 : TRUE ;\n"+
        "    x28 > x46 : TRUE ;\n"+
        "    x60 > x78 : TRUE ;\n"+
        "    x29 > x47 : TRUE ;\n"+
        "    x33 > x42 : TRUE ;\n"+
        "    x30 > x48 : TRUE ;\n"+
        "    x62 > x80 : TRUE ;\n"+
        "    x75 > x74 : TRUE ;\n"+
        "    x9 > x3 : TRUE ;\n"+
        "    x43 > x52 : TRUE ;\n"+
        "    x40 > x49 : TRUE ;\n"+
        "    x4 > x2 : TRUE ;\n"+
        "    x16 > x34 : TRUE ;\n"+
        "    x57 > x56 : TRUE ;\n"+
        "    x17 > x14 : TRUE ;\n"+
        "    x58 > x55 : TRUE ;\n"+
        "    x40 > x67 : TRUE ;\n"+
        "    x29 > x38 : TRUE ;\n"+
        "    x9 > x36 : TRUE ;\n"+
        "    x32 > x41 : TRUE ;\n"+
        "    x64 > x73 : TRUE ;\n"+
        "    x60 > x57 : TRUE ;\n"+
        "    x24 > x23 : TRUE ;\n"+
        "    x52 > x79 : TRUE ;\n"+
        "    x12 > x11 : TRUE ;\n"+
        "    x25 > x19 : TRUE ;\n"+
        "    x26 > x20 : TRUE ;\n"+
        "    x2 > x11 : TRUE ;\n"+
        "    x5 > x2 : TRUE ;\n"+
        "    x6 > x5 : TRUE ;\n"+
        "    x41 > x40 : TRUE ;\n"+
        "    x53 > x80 : TRUE ;\n"+
        "    x16 > x70 : TRUE ;\n"+
        "    x33 > x30 : TRUE ;\n"+
        "    x42 > x39 : TRUE ;\n"+
        "    x35 > x32 : TRUE ;\n"+
        "    x44 > x41 : TRUE ;\n"+
        "    x15 > x13 : TRUE ;\n"+
        "    x16 > x10 : TRUE ;\n"+
        "    x65 > x74 : TRUE ;\n"+
        "    x4 > x22 : TRUE ;\n"+
        "    x52 > x48 : TRUE ;\n"+
        "    x7 > x3 : TRUE ;\n"+
        "    x5 > x23 : TRUE ;\n"+
        "    x38 > x65 : TRUE ;\n"+
        "    x32 > x31 : TRUE ;\n"+
        "    x6 > x24 : TRUE ;\n"+
        "    x36 > x34 : TRUE ;\n"+
        "    x14 > x41 : TRUE ;\n"+
        "    x45 > x43 : TRUE ;\n"+
        "    x15 > x24 : TRUE ;\n"+
        "    x49 > x46 : TRUE ;\n"+
        "    x17 > x71 : TRUE ;\n"+
        "    x68 > x67 : TRUE ;\n"+
        "    x51 > x48 : TRUE ;\n"+
        "    x9 > x63 : TRUE ;\n"+
        "    x10 > x64 : TRUE ;\n"+
        "    x34 > x43 : TRUE ;\n"+
        "    x38 > x37 : TRUE ;\n"+
        "    x21 > x75 : TRUE ;\n"+
        "    x70 > x66 : TRUE ;\n"+
        "    x57 > x75 : TRUE ;\n"+
        "    x1 > x55 : TRUE ;\n"+
        "    x25 > x52 : TRUE ;\n"+
        "    x2 > x56 : TRUE ;\n"+
        "    x28 > x37 : TRUE ;\n"+
        "    x60 > x69 : TRUE ;\n"+
        "    x17 > x16 : TRUE ;\n"+
        "    x61 > x79 : TRUE ;\n"+
        "    x18 > x15 : TRUE ;\n"+
        "    x23 > x22 : TRUE ;\n"+
        "    x30 > x39 : TRUE ;\n"+
        "    x62 > x71 : TRUE ;\n"+
        "    x60 > x59 : TRUE ;\n"+
        "    x36 > x54 : TRUE ;\n"+
        "    x55 > x73 : TRUE ;\n"+
        "    x9 > x18 : TRUE ;\n"+
        "    x66 > x65 : TRUE ;\n"+
        "    x25 > x21 : TRUE ;\n"+
        "    x15 > x12 : TRUE ;\n"+
        "    x72 > x69 : TRUE ;\n"+
        "    x5 > x4 : TRUE ;\n"+
        "    x46 > x73 : TRUE ;\n"+
        "    x6 > x3 : TRUE ;\n"+
        "    x61 > x70 : TRUE ;\n"+
        "    x56 > x55 : TRUE ;\n"+
        "    x33 > x32 : TRUE ;\n"+
        "    x34 > x31 : TRUE ;\n"+
        "    x39 > x38 : TRUE ;\n"+
        "    x44 > x43 : TRUE ;\n"+
        "    x16 > x12 : TRUE ;\n"+
        "    x69 > x66 : TRUE ;\n"+
        "    x7 > x1 : TRUE ;\n"+
        "    x21 > x20 : TRUE ;\n"+
        "    x30 > x57 : TRUE ;\n"+
        "    x22 > x19 : TRUE ;\n"+
        "    x31 > x40 : TRUE ;\n"+
        "    x67 > x64 : TRUE ;\n"+
        "    x7 > x61 : TRUE ;\n"+
        "    x13 > x40 : TRUE ;\n"+
        "    x76 > x73 : TRUE ;\n"+
        "    x50 > x47 : TRUE ;\n"+
        "    x27 > x25 : TRUE ;\n"+
        "    x1 > x28 : TRUE ;\n"+
        "    x3 > x2 : TRUE ;\n"+
        "    x72 > x81 : TRUE ;\n"+
        "    x5 > x32 : TRUE ;\n"+
        "    x53 > x50 : TRUE ;\n"+
        "    x54 > x53 : TRUE ;\n"+
        "    x17 > x11 : TRUE ;\n"+
        "    x18 > x12 : TRUE ;\n"+
        "    x24 > x22 : TRUE ;\n"+
        "    x31 > x49 : TRUE ;\n"+
        "    x9 > x7 : TRUE ;\n"+
        "    x78 > x76 : TRUE ;\n"+
        "    x41 > x68 : TRUE ;\n"+
        "    x18 > x72 : TRUE ;\n"+
        "    x12 > x10 : TRUE ;\n"+
        "    x1 > x19 : TRUE ;\n"+
        "    x56 > x74 : TRUE ;\n"+
        "    x2 > x20 : TRUE ;\n"+
        "    x71 > x70 : TRUE ;\n"+
        "    x23 > x50 : TRUE ;\n"+
        "    x11 > x38 : TRUE ;\n"+
        "    x34 > x28 : TRUE ;\n"+
        "    x43 > x39 : TRUE ;\n"+
        "    x63 > x62 : TRUE ;\n"+
        "    x40 > x38 : TRUE ;\n"+
        "    x36 > x30 : TRUE ;\n"+
        "    x10 > x19 : TRUE ;\n"+
        "    x13 > x10 : TRUE ;\n"+
        "    x16 > x13 : TRUE ;\n"+
        "    x14 > x13 : TRUE ;\n"+
        "    x20 > x74 : TRUE ;\n"+
        "    x27 > x21 : TRUE ;\n"+
        "    x25 > x61 : TRUE ;\n"+
        "    x72 > x71 : TRUE ;\n"+
        "    x16 > x43 : TRUE ;\n"+
        "    x5 > x14 : TRUE ;\n"+
        "    x27 > x63 : TRUE ;\n"+
        "    x24 > x78 : TRUE ;\n"+
        "    x7 > x16 : TRUE ;\n"+
        "    x33 > x60 : TRUE ;\n"+
        "    x7 > x34 : TRUE ;\n"+
        "    x39 > x66 : TRUE ;\n"+
        "    x61 > x55 : TRUE ;\n"+
        "    x35 > x34 : TRUE ;\n"+
        "    x62 > x56 : TRUE ;\n"+
        "    x41 > x50 : TRUE ;\n"+
        "    x37 > x64 : TRUE ;\n"+
        "    x9 > x27 : TRUE ;\n"+
        "    x79 > x76 : TRUE ;\n"+
        "    x10 > x28 : TRUE ;\n"+
        "    x19 > x55 : TRUE ;\n"+
        "    x26 > x25 : TRUE ;\n"+
        "    x12 > x30 : TRUE ;\n"+
        "    x51 > x49 : TRUE ;\n"+
        "    x13 > x31 : TRUE ;\n"+
        "    x69 > x68 : TRUE ;\n"+
        "    x14 > x32 : TRUE ;\n"+
        "    x81 > x78 : TRUE ;\n"+
        "    x30 > x29 : TRUE ;\n"+
        "    x29 > x56 : TRUE ;\n"+
        "    x33 > x51 : TRUE ;\n"+
        "    x34 > x52 : TRUE ;\n"+
        "    x7 > x25 : TRUE ;\n"+
        "    x65 > x64 : TRUE ;\n"+
        "    x18 > x17 : TRUE ;\n"+
        "    x12 > x39 : TRUE ;\n"+
        "    x75 > x73 : TRUE ;\n"+
        "    x17 > x44 : TRUE ;\n"+
        "    x44 > x38 : TRUE ;\n"+
        "    x45 > x39 : TRUE ;\n"+
        "    x66 > x75 : TRUE ;\n"+
        "    x13 > x22 : TRUE ;\n"+
        "    x71 > x65 : TRUE ;\n"+
        "    x4 > x31 : TRUE ;\n"+
        "    x53 > x52 : TRUE ;\n"+
        "    x57 > x55 : TRUE ;\n"+
        "    x54 > x51 : TRUE ;\n"+
        "    x63 > x72 : TRUE ;\n"+
        "    x58 > x56 : TRUE ;\n"+
        "    x14 > x68 : TRUE ;\n"+
        "    x60 > x58 : TRUE ;\n"+
        "    x17 > x35 : TRUE ;\n"+
        "    x37 > x46 : TRUE ;\n"+
        "    x18 > x36 : TRUE ;\n"+
        "    x80 > x74 : TRUE ;\n"+
        "    x39 > x48 : TRUE ;\n"+
        "    x63 > x57 : TRUE ;\n"+
        "    x59 > x77 : TRUE ;\n"+
        "    x27 > x54 : TRUE ;\n"+
        "    x63 > x81 : TRUE ;\n"+
        "    x10 > x37 : TRUE ;\n"+
        "    x17 > x26 : TRUE ;\n"+
        "    x31 > x58 : TRUE ;\n"+
        "    x61 > x58 : TRUE ;\n"+
        "    x42 > x40 : TRUE ;\n"+
        "    x62 > x61 : TRUE ;\n"+
        "    x43 > x37 : TRUE ;\n"+
        "    x56 > x65 : TRUE ;\n"+
        "    x50 > x49 : TRUE ;\n"+
        "    x14 > x11 : TRUE ;\n"+
        "    x44 > x71 : TRUE ;\n"+
        "    x4 > x13 : TRUE ;\n"+
        "    x3 > x12 : TRUE ;\n"+
        "    x6 > x15 : TRUE ;\n"+
        "    x42 > x41 : TRUE ;\n"+
        "    x36 > x63 : TRUE ;\n"+
        "    x42 > x51 : TRUE ;\n"+
        "    x45 > x42 : TRUE ;\n"+
        "    x77 > x74 : TRUE ;\n"+
        "    x70 > x64 : TRUE ;\n"+
        "    x45 > x72 : TRUE ;\n"+
        "    x48 > x75 : TRUE ;\n"+
        "    x69 > x78 : TRUE ;\n"+
        "    x29 > x28 : TRUE ;\n"+
        "    x81 > x80 : TRUE ;\n"+
        "    x71 > x80 : TRUE ;\n"+
        "    x28 > x55 : TRUE ;\n"+
        "    x8 > x2 : TRUE ;\n"+
        "    x15 > x69 : TRUE ;\n"+
        "    x5 > x59 : TRUE ;\n"+
        "    x6 > x60 : TRUE ;\n"+
        "    x27 > x81 : TRUE ;\n"+
        "    x12 > x21 : TRUE ;\n"+
        "    x42 > x69 : TRUE ;\n"+
        "    x70 > x67 : TRUE ;\n"+
        "    x14 > x23 : TRUE ;\n"+
        "    x3 > x30 : TRUE ;\n"+
        "    x21 > x57 : TRUE ;\n"+
        "    x4 > x1 : TRUE ;\n"+
        "    x59 > x68 : TRUE ;\n"+
        "    x24 > x60 : TRUE ;\n"+
        "    x48 > x47 : TRUE ;\n"+
        "    x55 > x64 : TRUE ;\n"+
        "    x18 > x16 : TRUE ;\n"+
        "    x49 > x76 : TRUE ;\n"+
        "    x36 > x45 : TRUE ;\n"+
        "    x35 > x44 : TRUE ;\n"+
        "    x32 > x50 : TRUE ;\n"+
        "    x38 > x47 : TRUE ;\n"+
        "    x45 > x54 : TRUE ;\n"+
        "    x43 > x70 : TRUE ;\n"+
        "    x3 > x21 : TRUE ;\n"+
        "    x72 > x70 : TRUE ;\n"+
        "    x26 > x53 : TRUE ;\n"+
        "    x6 > x4 : TRUE ;\n"+
        "    x13 > x67 : TRUE ;\n"+
        "    x25 > x79 : TRUE ;\n"+
        "    x18 > x27 : TRUE ;\n"+
        "    x33 > x31 : TRUE ;\n"+
        "    x62 > x59 : TRUE ;\n"+
        "    x39 > x37 : TRUE ;\n"+
        "    x35 > x29 : TRUE ;\n"+
        "    x15 > x14 : TRUE ;\n"+
        "    x26 > x62 : TRUE ;\n"+
        "    x81 > x75 : TRUE ;\n"+
        "    x7 > x4 : TRUE ;\n"+
        "    x31 > x29 : TRUE ;\n"+
        "    x21 > x19 : TRUE ;\n"+
        "    x22 > x20 : TRUE ;\n"+
        "    x35 > x62 : TRUE ;\n"+
        "    x36 > x33 : TRUE ;\n"+
        "    x76 > x74 : TRUE ;\n"+
        "    x45 > x44 : TRUE ;\n"+
        "    x77 > x76 : TRUE ;\n"+
        "    x49 > x47 : TRUE ;\n"+
        "    x11 > x29 : TRUE ;\n"+
        "    x67 > x76 : TRUE ;\n"+
        "    x3 > x1 : TRUE ;\n"+
        "    x15 > x33 : TRUE ;\n"+
        "    x11 > x65 : TRUE ;\n"+
        "    TRUE : error;\n"+
        "    esac ;\n"+

       "     next ( x1 ) := x1 ; \n"+
        "    next ( x2 ) := x2 ; \n"+
        "    next ( x3 ) := x3 ; \n"+
        "    next ( x4 ) := x4 ; \n"+
        "    next ( x5 ) := x5 ; \n"+
        "    next ( x6 ) := x6 ; \n"+
        "    next ( x7 ) := x7 ; \n"+
        "    next ( x8 ) := x8 ; \n"+
        "    next ( x9 ) := x9 ; \n"+
        "    next ( x10 ) := x10 ; \n"+
        "    next ( x11 ) := x11 ; \n"+
        "    next ( x12 ) := x12 ; \n"+
        "    next ( x13 ) := x13 ; \n"+
        "    next ( x14 ) := x14 ; \n"+
        "    next ( x15 ) := x15 ; \n"+
        "    next ( x16 ) := x16 ; \n"+
        "    next ( x17 ) := x17 ; \n"+
        "    next ( x18 ) := x18 ; \n"+
        "    next ( x19 ) := x19 ; \n"+
        "    next ( x20 ) := x20 ; \n"+
        "    next ( x21 ) := x21 ; \n"+
        "    next ( x22 ) := x22 ; \n"+
        "    next ( x23 ) := x23 ; \n"+
        "    next ( x24 ) := x24 ; \n"+
        "    next ( x25 ) := x25 ; \n"+
        "    next ( x26 ) := x26 ; \n"+
        "    next ( x27 ) := x27 ; \n"+
        "    next ( x28 ) := x28 ; \n"+
        "    next ( x29 ) := x29 ; \n"+
        "    next ( x30 ) := x30 ; \n"+
        "    next ( x31 ) := x31 ; \n"+
        "    next ( x32 ) := x32 ; \n"+
        "    next ( x33 ) := x33 ; \n"+
        "    next ( x34 ) := x34 ; \n"+
        "    next ( x35 ) := x35 ; \n"+
        "    next ( x36 ) := x36 ; \n"+
        "    next ( x37 ) := x37 ; \n"+
        "    next ( x38 ) := x38 ; \n"+
        "    next ( x39 ) := x39 ; \n"+
        "    next ( x40 ) := x40 ; \n"+
        "    next ( x41 ) := x41 ; \n"+
        "    next ( x42 ) := x42 ; \n"+
        "    next ( x43 ) := x43 ; \n"+
        "    next ( x44 ) := x44 ; \n"+
        "    next ( x45 ) := x45 ; \n"+
        "    next ( x46 ) := x46 ; \n"+
        "    next ( x47 ) := x47 ; \n"+
        "    next ( x48 ) := x48 ; \n"+
        "    next ( x49 ) := x49 ; \n"+
        "    next ( x50 ) := x50 ; \n"+
        "    next ( x51 ) := x51 ; \n"+
        "    next ( x52 ) := x52 ; \n"+
        "    next ( x53 ) := x53 ; \n"+
        "    next ( x54 ) := x54 ; \n"+
        "    next ( x55 ) := x55 ; \n"+
        "    next ( x56 ) := x56 ; \n"+
        "    next ( x57 ) := x57 ; \n"+
        "    next ( x58 ) := x58 ; \n"+
        "    next ( x59 ) := x59 ; \n"+
        "    next ( x60 ) := x60 ; \n"+
        "    next ( x61 ) := x61 ; \n"+
        "    next ( x62 ) := x62 ; \n"+
        "    next ( x63 ) := x63 ; \n"+
        "    next ( x64 ) := x64 ; \n"+
        "    next ( x65 ) := x65 ; \n"+
        "    next ( x66 ) := x66 ; \n"+
        "    next ( x67 ) := x67 ; \n"+
        "    next ( x68 ) := x68 ; \n"+
        "    next ( x69 ) := x69 ; \n"+
        "    next ( x70 ) := x70 ; \n"+
        "    next ( x71 ) := x71 ; \n"+
        "    next ( x72 ) := x72 ; \n"+
        "    next ( x73 ) := x73 ; \n"+
        "    next ( x74 ) := x74 ; \n"+
        "    next ( x75 ) := x75 ; \n"+
        "    next ( x76 ) := x76 ; \n"+
        "    next ( x77 ) := x77 ; \n"+
        "    next ( x78 ) := x78 ; \n"+
        "    next ( x79 ) := x79 ; \n"+
        "    next ( x80 ) := x80 ; \n"+
        "    next ( x81 ) := x81 ; \n"+

		"	next(X1) := case\n"+
		"	x1 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	next(X2) := case\n"+
		"	x2 = 1 : TRUE;\n"+
		"	TRUE : FALSE;	\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X3) := case\n"+
		"	x3 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X4) := case\n"+
		"	x4 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X5) := case\n"+
		"	x5 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X6) := case\n"+
		"	x6 = 1 : TRUE;\n"+
		"	TRUE : FALSE;	\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X7) := case\n"+
		"	x7 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X8) := case\n"+
		"	x8 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X9) := case\n"+
		"	x9 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X10) := case\n"+
		"	x10 = 1 : TRUE;\n"+
		"	TRUE : FALSE;	\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X11) := case\n"+
		"	x11 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X12) := case\n"+
		"	x12 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X13) := case\n"+
		"	x13 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X14) := case\n"+
		"	x14 = 1 : TRUE;\n"+
		"	TRUE : FALSE;	\n"+
		"	esac;\n"+

	"		next(X15) := case\n"+
		"	x15 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X16) := case\n"+
		"	x16 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X17) := case\n"+
		"	x17 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X18) := case\n"+
		"	x18 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X19) := case\n"+
		"	x19 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X20) := case\n"+
		"	x20 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X22) := case\n"+
		"	x22 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X23) := case\n"+
		"	x23 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X24) := case\n"+
		"	x24 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X25) := case\n"+
		"	x25 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X26) := case\n"+
		"	x26 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X27) := case\n"+
		"	x27 = 1 : TRUE;\n"+
		"	TRUE : FALSE;	\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X28) := case\n"+
		"	x28 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X29) := case\n"+
		"	x29 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X30) := case\n"+
		"	x30 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X31) := case\n"+
		"	x31 = 1 : TRUE;\n"+
		"	TRUE : FALSE;	\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X32) := case\n"+
		"	x32 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X33) := case\n"+
		"	x33 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X34) := case\n"+
		"	x34 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X35) := case\n"+
		"	x35 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X36) := case\n"+
		"	x36 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X37) := case\n"+
		"	x37 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X38) := case\n"+
		"	x38 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X40) := case\n"+
		"	x40 = 1 : TRUE;\n"+
		"	TRUE : FALSE;	\n"+
		"	esac;	\n"+
		"	\n"+
		"	next(X42) := case\n"+
		"	x42 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X43) := case\n"+
		"	x43 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X44) := case\n"+
		"	x44 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X45) := case\n"+
		"	x45 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;	\n"+
		"	\n"+
		"	next(X46) := case\n"+
		"	x46 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X47) := case\n"+
		"	x47 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X48) := case\n"+
		"	x48 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X49) := case\n"+
		"	x49 = 1 : TRUE;\n"+
		"	TRUE : FALSE;	\n"+
		"	esac;	\n"+
		"	\n"+
		"	next(X50) := case\n"+
		"	x50 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X51) := case\n"+
		"	x51 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X52) := case\n"+
		"	x52 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X53) := case\n"+
		"	x53 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;	\n"+
		"	\n"+
		"	next(X54) := case\n"+
		"	x54 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X55) := case\n"+
		"	x55 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X56) := case\n"+
		"	x56 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X57) := case\n"+
		"	x57 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;		\n"+
		"	\n"+
		"	next(X58) := case\n"+
		"	x58 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X59) := case\n"+
		"	x59 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X60) := case\n"+
		"	x60 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X61) := case\n"+
		"	x61 = 1 : TRUE;\n"+
		"	TRUE : FALSE;	\n"+
		"	esac;	\n"+
		"	\n"+
		"	next(X62) := case\n"+
		"	x62 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X63) := case\n"+
		"	x63 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X64) := case\n"+
		"	x64 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X65) := case\n"+
		"	x65 = 1 : TRUE;\n"+
		"	TRUE : FALSE;	\n"+
		"	esac;	\n"+
		"	\n"+
		"	next(X66) := case\n"+
		"	x66 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X67) := case\n"+
		"	x67 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X68) := case\n"+
		"	x68 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X69) := case\n"+
		"	x69 = 1 : TRUE;\n"+
		"	TRUE : FALSE;	\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X70) := case\n"+
		"	x70 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X71) := case\n"+
		"	x71 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X72) := case\n"+
		"	x72 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X73) := case\n"+
		"	x73 = 1 : TRUE;\n"+
		"	TRUE : FALSE;	\n"+
		"	esac;	\n"+
		"	\n"+
		"	next(X74) := case\n"+
		"	x74 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X75) := case\n"+
		"	x75 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X76) := case\n"+
		"	x76 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X77) := case\n"+
		"	x77 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;		\n"+
		"	\n"+
		"	next(X78) := case\n"+
		"	x78 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X79) := case\n"+
		"	x79 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+
		"	\n"+
		"	next(X80) := case\n"+
		"	x80 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+
		"	esac;\n"+

	"		next(X81) := case\n"+
		"	x81 = 1 : TRUE;\n"+
		"	TRUE : FALSE;\n"+

	"		esac;\n"
);
    // "   LTLSPEC G (X (error = TRUE));\n");
	
		return states81.toString();
	}
}
