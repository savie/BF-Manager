package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ܶܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C16195 extends C7246 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22185 f52575;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16195(C22185 c22185) {
        super(c22185, EnumC6282.CLASS_PATH, EnumC7687.f25344);
        this.f52575 = c22185;
    }

    @Override // l.C7246
    /* JADX INFO: renamed from: ۫ */
    public final C8737 mo19876() {
        String property = System.getProperty("env.class.path");
        if (property == null && System.getProperty("application.home") == null) {
            property = System.getProperty("java.class.path");
        }
        if (property == null) {
            property = ".";
        }
        C8737 c8737Mo19875 = mo19875();
        c8737Mo19875.m23422(property);
        return c8737Mo19875;
    }

    @Override // l.C7246
    /* JADX INFO: renamed from: ۚ */
    public final C8737 mo19875() {
        C22185 c22185 = this.f52575;
        C8737 c8737 = new C8737(c22185);
        c8737.m23426();
        c8737.m23424(c22185.m50194(".", new String[0]));
        return c8737;
    }

    @Override // l.C7246, l.AbstractC23655
    /* JADX INFO: renamed from: ᩷ */
    public final Collection mo4675() {
        if (this.f23892 == null) {
            mo4669((Iterable) null);
        }
        return this.f23892;
    }
}
