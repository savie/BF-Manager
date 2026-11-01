package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺ۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1KC */
/* JADX INFO: loaded from: classes.dex */
public final class C22756 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f74107;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C17078 f74108;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C17078 f74111;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C17078 f74112;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f74114;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C17078 f74115;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f74113 = new ArrayList();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList f74109 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f74110 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50420(C11018 c11018) {
        c11018.writeByte(this.f74107);
        ArrayList<C17078> arrayList = this.f74113;
        c11018.mo24508(arrayList.size());
        for (C17078 c17078 : arrayList) {
            c11018.writeInt(c17078.f52692);
            c11018.writeInt(c17078.f52691);
        }
        ArrayList<C17078> arrayList2 = this.f74109;
        c11018.mo24508(arrayList2.size());
        for (C17078 c17079 : arrayList2) {
            c11018.writeInt(c17079.f52692);
            c11018.writeInt(c17079.f52691);
        }
        if (this.f74112 != null) {
            c11018.m27784(true);
            c11018.writeInt(this.f74112.f52692);
            c11018.writeInt(this.f74112.f52691);
            c11018.writeInt(this.f74108.f52692);
            c11018.writeInt(this.f74108.f52691);
        } else {
            c11018.writeByte(0);
        }
        if (this.f74111 != null) {
            c11018.m27784(true);
            c11018.writeInt(this.f74111.f52692);
            c11018.writeInt(this.f74111.f52691);
            c11018.writeInt(this.f74115.f52692);
            c11018.writeInt(this.f74115.f52691);
        } else {
            c11018.writeByte(0);
        }
        c11018.mo24508(this.f74110 + 1);
        c11018.writeInt(this.f74114);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50421(C17367 c17367) {
        this.f74107 = c17367.readByte();
        int iM40462 = c17367.m40462();
        ArrayList arrayList = this.f74113;
        arrayList.clear();
        for (int i = 0; i < iM40462; i++) {
            arrayList.add(new C17078(c17367.readInt(), c17367.readInt(), false));
        }
        int iM40463 = c17367.m40462();
        ArrayList arrayList2 = this.f74109;
        arrayList2.clear();
        for (int i2 = 0; i2 < iM40463; i2++) {
            arrayList2.add(new C17078(c17367.readInt(), c17367.readInt(), true));
        }
        if (c17367.m40461()) {
            this.f74112 = new C17078(c17367.readInt(), c17367.readInt(), false);
            this.f74108 = new C17078(c17367.readInt(), c17367.readInt(), true);
        } else {
            this.f74108 = null;
            this.f74112 = null;
        }
        if (c17367.m40461()) {
            this.f74111 = new C17078(c17367.readInt(), c17367.readInt(), false);
            this.f74115 = new C17078(c17367.readInt(), c17367.readInt(), true);
        } else {
            this.f74115 = null;
            this.f74111 = null;
        }
        this.f74110 = c17367.m40462() - 1;
        this.f74114 = c17367.readInt();
    }
}
