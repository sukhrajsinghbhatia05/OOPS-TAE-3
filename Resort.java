class Resort {
    int RNo, Days; [cite: 13]
    String Name; [cite: 13]
    float Charges; [cite: 13]

    float Compute() { [cite: 15]
        float amount = Days * Charges;
        return (amount > 11000) ? 1.02f * amount : amount;
    }

    void GetInfo(int r, String n, float c, int d) { [cite: 16]
        RNo = r; Name = n; Charges = c; Days = d;
    }

    void DispInfo() { [cite: 17]
        System.out.println(RNo + " " + Name + " Total: " + Compute());
    }
}
