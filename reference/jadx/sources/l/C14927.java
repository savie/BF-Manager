package l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܶ֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: D9GX */
/* JADX INFO: loaded from: classes5.dex */
public final class C14927 extends C11771 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public EnumSet f48701;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public EnumSet f48702;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte f48703;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumSet f48704;

    @Override // l.C11771
    /* JADX INFO: renamed from: ܰ */
    public final void mo2356(C19240 c19240) throws C17271 {
        c19240.m27389(2);
        this.f48703 = c19240.m27388();
        c19240.m27388();
        this.f48701 = C20799.m46782(c19240.m27394(), EnumC6831.class);
        this.f48702 = C20799.m46782(c19240.m27394(), EnumC4008.class);
        this.f48704 = C20799.m46782(c19240.m27394(), EnumC14346.class);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m35676() {
        return this.f48703 == 1;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m35674() {
        return this.f48703 == 2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m35675() {
        return this.f48703 == 3;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final EnumSet m35672() {
        return this.f48701;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Set m35673() {
        return this.f48702;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumSet m35671() {
        return this.f48704;
    }
}
