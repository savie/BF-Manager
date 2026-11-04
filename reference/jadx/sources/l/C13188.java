package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B1KC */
/* JADX INFO: loaded from: classes4.dex */
public final class C13188 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14723 f42118;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f42119;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C14723 f42120;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C14723 f42121;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f42122;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14723 f42123;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f42117 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f42115 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f42116 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32703(C6178 c6178) {
        c6178.writeByte(this.f42119);
        ArrayList<C14723> arrayList = this.f42117;
        c6178.mo17812(arrayList.size());
        for (C14723 c14723 : arrayList) {
            c6178.writeInt(c14723.f79289);
            c6178.writeInt(c14723.f79288);
        }
        ArrayList<C14723> arrayList2 = this.f42115;
        c6178.mo17812(arrayList2.size());
        for (C14723 c14724 : arrayList2) {
            c6178.writeInt(c14724.f79289);
            c6178.writeInt(c14724.f79288);
        }
        if (this.f42118 != null) {
            c6178.m17789(true);
            c6178.writeInt(this.f42118.f79289);
            c6178.writeInt(this.f42118.f79288);
            c6178.writeInt(this.f42123.f79289);
            c6178.writeInt(this.f42123.f79288);
        } else {
            c6178.writeByte(0);
        }
        if (this.f42121 != null) {
            c6178.m17789(true);
            c6178.writeInt(this.f42121.f79289);
            c6178.writeInt(this.f42121.f79288);
            c6178.writeInt(this.f42120.f79289);
            c6178.writeInt(this.f42120.f79288);
        } else {
            c6178.writeByte(0);
        }
        c6178.mo17812(this.f42116 + 1);
        c6178.writeInt(this.f42122);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32704(C20348 c20348) {
        this.f42119 = c20348.readByte();
        int iM46749 = c20348.m46749();
        ArrayList arrayList = this.f42117;
        arrayList.clear();
        for (int i = 0; i < iM46749; i++) {
            arrayList.add(new C14723(c20348.readInt(), c20348.readInt(), false));
        }
        int iM467410 = c20348.m46749();
        ArrayList arrayList2 = this.f42115;
        arrayList2.clear();
        for (int i2 = 0; i2 < iM467410; i2++) {
            arrayList2.add(new C14723(c20348.readInt(), c20348.readInt(), true));
        }
        if (c20348.m46753()) {
            this.f42118 = new C14723(c20348.readInt(), c20348.readInt(), false);
            this.f42123 = new C14723(c20348.readInt(), c20348.readInt(), true);
        } else {
            this.f42123 = null;
            this.f42118 = null;
        }
        if (c20348.m46753()) {
            this.f42121 = new C14723(c20348.readInt(), c20348.readInt(), false);
            this.f42120 = new C14723(c20348.readInt(), c20348.readInt(), true);
        } else {
            this.f42120 = null;
            this.f42121 = null;
        }
        this.f42116 = c20348.m46749() - 1;
        this.f42122 = c20348.readInt();
    }
}
