package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C2820 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f9268;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f9269;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f9270;

    public C2820(C22737 c22737) {
        String type = c22737.getType();
        this.f9270 = type.substring(1, type.length() - 1).replace('/', '.');
        this.f9269 = c22737.m51267();
        Iterator it = c22737.getAnnotations().iterator();
        while (it.hasNext()) {
            if (((C24558) it.next()).getType().equals("Lbin/mt/annotations/MTProtector;")) {
                this.f9268 = true;
                return;
            }
        }
        Iterator it2 = c22737.getMethods().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((C4091) it2.next()).getAnnotations().iterator();
            while (it3.hasNext()) {
                if (((InterfaceC7886) it3.next()).getType().equals("Lbin/mt/annotations/MTProtector;")) {
                    this.f9268 = true;
                    return;
                }
            }
        }
    }
}
