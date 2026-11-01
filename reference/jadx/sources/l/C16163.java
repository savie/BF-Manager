package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.LinkedHashSet;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺ᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 440F */
/* JADX INFO: loaded from: classes4.dex */
public class C16163 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C16163 f52229 = new C21101(null, null);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C11867 f52230;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC7696 f52231;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C11867 f52232;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22492 f52233;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean m38255() {
        return !(this instanceof C21101);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m38251() {
        C22492 c22492;
        while (true) {
            c22492 = this.f52233;
            if (c22492.f77451.mo1180()) {
                break;
            } else {
                c22492.mo49994();
            }
        }
        InterfaceC7696 interfaceC7696 = this.f52231;
        if (interfaceC7696 != null) {
            this.f52231 = null;
            interfaceC7696.mo20330(c22492);
        }
    }

    public C16163(C22492 c22492, InterfaceC7696 interfaceC7696) {
        this.f52233 = c22492;
        this.f52231 = interfaceC7696;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C11867 mo38256() {
        m38251();
        return this.f52232;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38254(C11867 c11867) {
        C6171.m17178(this.f52232);
        this.f52232 = c11867;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C11867 mo38252() {
        m38251();
        return this.f52230;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38258(C11867 c11867) {
        C6171.m17178(this.f52230);
        this.f52230 = c11867;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet mo38253() {
        m38251();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C22492 c22492 = this.f52233;
        c22492.mo49994();
        for (AbstractC23903 abstractC23903 : c22492.f73417.mo3802((Predicate) null, EnumC10167.NON_RECURSIVE)) {
            if (abstractC23903.f77452 == EnumC10477.f35879) {
                AbstractC11242 abstractC11242 = abstractC23903.f77453;
                if (abstractC11242 != abstractC11242.f38032.f21322.f77608 && (abstractC23903.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                    linkedHashSet.add((C18258) abstractC23903);
                }
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet mo38257() {
        m38251();
        LinkedHashSet<C18258> linkedHashSetMo38253 = mo38253();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C18258 c18258 : linkedHashSetMo38253) {
            if (c18258.f58258 != null) {
                linkedHashSet.add(c18258);
            }
        }
        return linkedHashSet;
    }

    public String toString() {
        return "Annotation type for: " + this.f52233;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C16163 m38250() {
        return f52229;
    }
}
