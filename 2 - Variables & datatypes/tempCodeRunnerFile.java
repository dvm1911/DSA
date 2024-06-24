  Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        int rad = sc.nextInt();
        float pi = 3.14f;
        float area = pi*(rad*rad);
        float circ = 2*pi*rad;
        System.out.println("Area of the circle: " + area + "\nCircumference of the circle: " + circ);
        