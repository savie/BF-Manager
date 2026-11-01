package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final class C21887 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f71004;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f71005;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f71006;

    public C21887(C7807 c7807) {
        String type = c7807.getType();
        this.f71006 = type.substring(1, type.length() - 1).replace('/', '.');
        this.f71005 = c7807.m20490();
        Iterator it = c7807.getAnnotations().iterator();
        while (it.hasNext()) {
            if (((C14158) it.next()).getType().equals("Lbin/mt/annotations/MTProtector;")) {
                this.f71004 = true;
                return;
            }
        }
        Iterator it2 = c7807.getMethods().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((C11770) it2.next()).getAnnotations().iterator();
            while (it3.hasNext()) {
                if (((InterfaceC3710) it3.next()).getType().equals("Lbin/mt/annotations/MTProtector;")) {
                    this.f71004 = true;
                    return;
                }
            }
        }
    }
}
