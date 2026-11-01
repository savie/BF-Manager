package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: GAQ7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10114 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34521;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f34522;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public synchronized void m25741(ArrayList arrayList) {
        if (arrayList.size() < 4096 && ((C19805) this.f34522).m45010()) {
            arrayList.clear();
            ((C19805) this.f34522).m45011(arrayList);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public synchronized ArrayList m25742() {
        ArrayList arrayList;
        arrayList = (ArrayList) ((C19805) this.f34522).m45009();
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f34521) {
            case 1:
                return String.valueOf(this.f34522);
            default:
                return super.toString();
        }
    }

    public C10114() {
        this.f34521 = 0;
        this.f34522 = new C19805();
    }

    public C10114(C23992 c23992) {
        this.f34521 = 1;
        this.f34522 = c23992;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object m25740() {
        return this.f34522;
    }
}
