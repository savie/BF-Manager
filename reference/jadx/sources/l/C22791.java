package l;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩺ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I62U */
/* JADX INFO: loaded from: classes.dex */
public class C22791 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f74176 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f74178 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f74177 = -1;

    /* JADX INFO: renamed from: ۚ */
    public Object mo21035() {
        Object objM50450 = m50450(0);
        int i = this.f74178 + 1;
        this.f74178 = i;
        ArrayList arrayList = this.f74176;
        if (i == arrayList.size()) {
            this.f74178 = 0;
            arrayList.clear();
        }
        return objM50450;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50451(InterfaceC19969 interfaceC19969) {
        this.f74176.add(interfaceC19969);
    }

    public int size() {
        return this.f74176.size() - this.f74178;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object m50450(int i) {
        int i2 = this.f74178 + i;
        ArrayList arrayList = this.f74176;
        if (i2 >= arrayList.size()) {
            StringBuilder sbM40153 = C17214.m40153(i2, "queue index ", " > last index ");
            sbM40153.append(arrayList.size() - 1);
            throw new NoSuchElementException(sbM40153.toString());
        }
        if (i2 < 0) {
            throw new NoSuchElementException(C2271.m6966(i2, "queue index ", " < 0"));
        }
        if (i2 > this.f74177) {
            this.f74177 = i2;
        }
        return arrayList.get(i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i = 0;
        while (i < size) {
            sb.append(m50450(i));
            i++;
            if (i < size) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
