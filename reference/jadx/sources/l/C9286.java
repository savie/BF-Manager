package l;

import android.content.ContextWrapper;

/* JADX INFO: renamed from: l.ۡۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9286 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C8541 f30187;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f30188;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f30189;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C21221 f30191;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14770 f30186 = C14770.f48339;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C12754 f30192 = InterfaceC10032.f32162;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C5297 f30190 = InterfaceC1084.f3878;

    public C9286(ContextWrapper contextWrapper) {
        this.f30188 = contextWrapper;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24498(InterfaceC22274[] interfaceC22274Arr) {
        this.f30187 = new C8541(interfaceC22274Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14991 m24497() {
        C20782.m47568(!this.f30189);
        this.f30189 = true;
        if (this.f30187 == null) {
            this.f30187 = new C8541(new InterfaceC22274[0]);
        }
        if (this.f30191 == null) {
            this.f30191 = new C21221(this.f30188);
        }
        return new C14991(this);
    }
}
