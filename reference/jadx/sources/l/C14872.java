package l;

import android.os.Build;

/* JADX INFO: renamed from: l.ܰ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 819Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C14872 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48599;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24570 f48600 = new C24570(true);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C24570 f48601;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C24570 f48602;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC21586 f48603;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C24570 f48604;

    public C14872() {
        int i = Build.VERSION.SDK_INT;
        this.f48604 = new C24570(i >= 24);
        this.f48602 = new C24570(i >= 28);
        this.f48601 = new C24570(i >= 33);
        this.f48603 = EnumC21586.FAIL;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m35811() {
        return this.f48600.f79639.m14098() && this.f48604.f79639.m14098() && this.f48602.f79639.m14098() && this.f48601.f79639.m14098();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC21586 m35809() {
        return this.f48603;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m35810() {
        return this.f48599;
    }
}
