package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۬ۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B8P4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13644 implements InterfaceC1603 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC1928 f43312;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f43313;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f43315;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f43310 = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C6933 f43309 = new C6933(new C2458());

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C6933 f43308 = new C6933(new C22121());

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C3509 f43314 = new C3509();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f43311 = true;

    @Override // l.InterfaceC1603
    /* JADX INFO: renamed from: ۙ */
    public final synchronized InterfaceC22486[] mo5617(Uri uri, Map map) {
        ArrayList arrayList;
        int[] iArr = f43310;
        arrayList = new ArrayList(21);
        List list = (List) map.get("Content-Type");
        int iM33907 = C13923.m33907((list == null || list.isEmpty()) ? null : (String) list.get(0));
        if (iM33907 != -1) {
            m33379(arrayList, iM33907);
        }
        int iM33905 = C13923.m33905(uri);
        if (iM33905 != -1 && iM33905 != iM33907) {
            m33379(arrayList, iM33905);
        }
        for (int i = 0; i < 21; i++) {
            int i2 = iArr[i];
            if (i2 != iM33907 && i2 != iM33905) {
                m33379(arrayList, i2);
            }
        }
        return (InterfaceC22486[]) arrayList.toArray(new InterfaceC22486[0]);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m33380() {
        this.f43315 = 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m33381() {
        this.f43313 = true;
    }

    @Override // l.InterfaceC1603
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC1603 mo5616(boolean z) {
        synchronized (this) {
            this.f43311 = z;
        }
        return this;
    }

    @Override // l.InterfaceC1603
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC1603 mo5615(C3509 c3509) {
        synchronized (this) {
            this.f43314 = c3509;
        }
        return this;
    }

    @Override // l.InterfaceC1603
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC1603 mo5614() {
        synchronized (this) {
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33379(ArrayList arrayList, int i) {
        switch (i) {
            case 0:
                arrayList.add(new C18054());
                break;
            case 1:
                arrayList.add(new C7613());
                break;
            case 2:
                arrayList.add(new C9849(this.f43313 ? 2 : 0));
                break;
            case 3:
                arrayList.add(new C1887(this.f43313 ? 2 : 0));
                break;
            case 4:
                InterfaceC22486 interfaceC22486M19216 = f43309.m19216(0);
                if (interfaceC22486M19216 != null) {
                    arrayList.add(interfaceC22486M19216);
                } else {
                    arrayList.add(new C18294());
                }
                break;
            case 5:
                arrayList.add(new C7853());
                break;
            case 6:
                arrayList.add(new C24415(this.f43314, this.f43311 ? 0 : 2));
                break;
            case 7:
                arrayList.add(new C8006(this.f43313 ? 2 : 0));
                break;
            case 8:
                arrayList.add(new C16231(this.f43314, this.f43311 ? 0 : 32, null, AbstractC1928.of()));
                arrayList.add(new C24437(this.f43314, this.f43311 ? 0 : 16));
                break;
            case 9:
                arrayList.add(new C5001());
                break;
            case 10:
                arrayList.add(new C18557());
                break;
            case 11:
                if (this.f43312 == null) {
                    this.f43312 = AbstractC1928.of();
                }
                arrayList.add(new C7370(1, !this.f43311 ? 1 : 0, this.f43314, new C1150(0L), new C9103(0, this.f43312)));
                break;
            case 12:
                arrayList.add(new C11603());
                break;
            case 14:
                arrayList.add(new C8598(this.f43315));
                break;
            case 15:
                InterfaceC22486 interfaceC22486M19217 = f43308.m19216(new Object[0]);
                if (interfaceC22486M19217 != null) {
                    arrayList.add(interfaceC22486M19217);
                }
                break;
            case 16:
                arrayList.add(new C17548(1 ^ (this.f43311 ? 1 : 0), this.f43314));
                break;
            case 17:
                arrayList.add(new C25139());
                break;
            case 18:
                arrayList.add(new C23538());
                break;
            case 19:
                arrayList.add(new C4124());
                break;
            case 20:
                arrayList.add(new C2632());
                break;
            case 21:
                arrayList.add(new C24262());
                break;
        }
    }
}
