package l;

/* JADX INFO: renamed from: l.᩹۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1RO */
/* JADX INFO: loaded from: classes.dex */
public final class C22305 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49472(InterfaceC5726[] interfaceC5726Arr) throws C6782 {
        for (int i = 0; i < interfaceC5726Arr.length - 1; i++) {
            if (!interfaceC5726Arr[i].mo5138()) {
                throw new C6782("Unsupported XZ filter chain");
            }
        }
        if (!interfaceC5726Arr[interfaceC5726Arr.length - 1].mo5137()) {
            throw new C6782("Unsupported XZ filter chain");
        }
        int i2 = 0;
        for (InterfaceC5726 interfaceC5726 : interfaceC5726Arr) {
            if (interfaceC5726.mo5136()) {
                i2++;
            }
        }
        if (i2 > 3) {
            throw new C6782("Unsupported XZ filter chain");
        }
    }
}
