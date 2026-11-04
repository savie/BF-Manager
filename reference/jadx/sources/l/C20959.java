package l;

import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩶֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RN */
/* JADX INFO: loaded from: classes5.dex */
public final class C20959 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f67035;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f67034 = new HashMap();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public UUID f67029 = C19158.f61988;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2764 f67028 = C18215.f59468;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int[] f67031 = new int[0];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f67033 = true;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C20773 f67030 = new C20773();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f67032 = 300000;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47911(UUID uuid) {
        uuid.getClass();
        this.f67029 = uuid;
        this.f67028 = C18215.f59468;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47912(boolean z) {
        this.f67035 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47913(int... iArr) {
        for (int i : iArr) {
            boolean z = true;
            if (i != 2 && i != 1) {
                z = false;
            }
            C20782.m47565(z);
        }
        this.f67031 = (int[]) iArr.clone();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m47914(boolean z) {
        this.f67033 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6789 m47910(C0316 c0316) {
        return new C6789(this.f67029, this.f67028, c0316, this.f67034, this.f67035, this.f67031, this.f67033, this.f67030, this.f67032);
    }
}
