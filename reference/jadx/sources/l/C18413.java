package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ܿܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes4.dex */
public final class C18413 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f59979;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f59980;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f59981;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f59982;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f59983;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f59984;

    public C18413(InterfaceC2731 interfaceC2731) {
        InterfaceC15344 type = interfaceC2731.getType();
        InterfaceC10869 interfaceC10869Mo4332 = type.mo4332();
        Locale locale = Locale.ROOT;
        int i = 0;
        this.f59983 = String.format(locale, "0x%02x", Integer.valueOf(interfaceC10869Mo4332.mo27607()));
        this.f59980 = interfaceC10869Mo4332.getPackageName();
        this.f59984 = String.format(locale, "0x%02x", Integer.valueOf(type.mo35833()));
        this.f59982 = type.getTypeName();
        this.f59981 = C10208.m26337(interfaceC2731);
        for (InterfaceC8697 interfaceC8697 : interfaceC2731.mo9078()) {
            i++;
        }
        this.f59979 = i;
    }
}
