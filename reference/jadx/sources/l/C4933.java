package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۙ᩹۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C4933 extends C7756 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20456 f17265;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4933(C20456 c20456) {
        super(c20456, EnumC3584.CLASS_PATH, EnumC19730.f63339);
        this.f17265 = c20456;
    }

    @Override // l.C7756
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C10579 mo13718() {
        String property = System.getProperty("env.class.path");
        if (property == null && System.getProperty("application.home") == null) {
            property = System.getProperty("java.class.path");
        }
        if (property == null) {
            property = ".";
        }
        C10579 c10579Mo13719 = mo13719();
        c10579Mo13719.m26754(property);
        return c10579Mo13719;
    }

    @Override // l.C7756
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C10579 mo13719() {
        C20456 c20456 = this.f17265;
        C10579 c10579 = new C10579(c20456);
        c10579.m26758();
        c10579.m26756(c20456.m46271(".", new String[0]));
        return c10579;
    }

    @Override // l.C7756, l.AbstractC14107
    /* JADX INFO: renamed from: ۨ */
    public final Collection mo9021() {
        if (this.f25610 == null) {
            mo4918((Iterable) null);
        }
        return this.f25610;
    }
}
