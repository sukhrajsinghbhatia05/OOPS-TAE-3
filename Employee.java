class Employee {
    int empno; String ename; [cite: 19]
    float basic, hra, da, netpay; [cite: 19]

    float Calculate() { return basic + hra + da; } [cite: 21]

    void haveData(int id, String n, float b, float h, float d) { [cite: 22]
        empno = id; ename = n; basic = b; hra = h; da = d;
        netpay = Calculate();
    }

    void dispData() { [cite: 23]
        System.out.println(ename + " Net Pay: " + netpay);
    }
}
