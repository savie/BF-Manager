package l;

/* JADX INFO: renamed from: l.۬ۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I59Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C12884 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f42845 = new ConcurrentMapC13783();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m31942(String str) {
        if (str.length() == 1) {
            switch (str) {
                case "B":
                    return -3;
                case "C":
                    return -5;
                case "D":
                    return -9;
                case "F":
                    return -7;
                case "I":
                    return -6;
                case "J":
                    return -8;
                case "S":
                    return -4;
                case "V":
                    return -1;
                case "Z":
                    return -2;
            }
        }
        Integer numValueOf = (Integer) this.f42845.get(str);
        if (numValueOf == null) {
            synchronized (this.f42845) {
                numValueOf = Integer.valueOf(this.f42845.size());
                this.f42845.put(str, numValueOf);
            }
        }
        return numValueOf.intValue();
    }
}
