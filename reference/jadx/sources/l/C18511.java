package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8P4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18511 implements InterfaceC0166 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC22433 f58959;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f58960;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f58962;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f58957 = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C17805 f58955 = new C17805(new C8550());

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C17805 f58956 = new C17805(new C15489(6));

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C11164 f58958 = new C11164();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f58961 = true;

    @Override // l.InterfaceC0166
    /* JADX INFO: renamed from: ۙ */
    public final synchronized InterfaceC10045[] mo1323(Uri uri, Map map) {
        ArrayList arrayList;
        int[] iArr = f58957;
        arrayList = new ArrayList(21);
        List list = (List) map.get("Content-Type");
        int iM2178 = C0418.m2178((list == null || list.isEmpty()) ? null : (String) list.get(0));
        if (iM2178 != -1) {
            m42900(arrayList, iM2178);
        }
        int iM2177 = C0418.m2177(uri);
        if (iM2177 != -1 && iM2177 != iM2178) {
            m42900(arrayList, iM2177);
        }
        for (int i = 0; i < 21; i++) {
            int i2 = iArr[i];
            if (i2 != iM2178 && i2 != iM2177) {
                m42900(arrayList, i2);
            }
        }
        return (InterfaceC10045[]) arrayList.toArray(new InterfaceC10045[0]);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m42901() {
        this.f58962 = 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m42902() {
        this.f58960 = true;
    }

    @Override // l.InterfaceC0166
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC0166 mo1322(boolean z) {
        synchronized (this) {
            this.f58961 = z;
        }
        return this;
    }

    @Override // l.InterfaceC0166
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC0166 mo1321(C11164 c11164) {
        synchronized (this) {
            this.f58958 = c11164;
        }
        return this;
    }

    @Override // l.InterfaceC0166
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC0166 mo1320() {
        synchronized (this) {
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42900(ArrayList arrayList, int i) {
        switch (i) {
            case 0:
                arrayList.add(new C11912());
                break;
            case 1:
                arrayList.add(new C5561());
                break;
            case 2:
                arrayList.add(new C1327(this.f58960 ? 2 : 0));
                break;
            case 3:
                arrayList.add(new C20006(this.f58960 ? 2 : 0));
                break;
            case 4:
                InterfaceC10045 interfaceC10045M41382 = f58955.m41382(0);
                if (interfaceC10045M41382 != null) {
                    arrayList.add(interfaceC10045M41382);
                } else {
                    arrayList.add(new C2843());
                }
                break;
            case 5:
                arrayList.add(new C22600());
                break;
            case 6:
                arrayList.add(new C9671(this.f58958, this.f58961 ? 0 : 2));
                break;
            case 7:
                arrayList.add(new C5624(this.f58960 ? 2 : 0));
                break;
            case 8:
                arrayList.add(new C17618(this.f58958, this.f58961 ? 0 : 32, null, AbstractC22433.of()));
                arrayList.add(new C9858(this.f58958, this.f58961 ? 0 : 16));
                break;
            case 9:
                arrayList.add(new C18219());
                break;
            case 10:
                arrayList.add(new C11602());
                break;
            case 11:
                if (this.f58959 == null) {
                    this.f58959 = AbstractC22433.of();
                }
                arrayList.add(new C15130(1, !this.f58961 ? 1 : 0, this.f58958, new C6694(0L), new C4149(0, this.f58959)));
                break;
            case 12:
                arrayList.add(new C20069());
                break;
            case 14:
                arrayList.add(new C15545(this.f58962));
                break;
            case 15:
                InterfaceC10045 interfaceC10045M41383 = f58956.m41382(new Object[0]);
                if (interfaceC10045M41383 != null) {
                    arrayList.add(interfaceC10045M41383);
                }
                break;
            case 16:
                arrayList.add(new C17183(1 ^ (this.f58961 ? 1 : 0), this.f58958));
                break;
            case 17:
                arrayList.add(new C0579());
                break;
            case 18:
                arrayList.add(new C5957());
                break;
            case 19:
                arrayList.add(new C4960());
                break;
            case 20:
                arrayList.add(new C23306());
                break;
            case 21:
                arrayList.add(new C3071());
                break;
        }
    }
}
