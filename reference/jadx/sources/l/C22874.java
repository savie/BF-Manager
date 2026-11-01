package l;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.᩺۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6LO */
/* JADX INFO: loaded from: classes.dex */
public final class C22874 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f74400;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public synchronized void m50617(C8608 c8608) {
        ((LinkedHashSet) this.f74400).remove(c8608);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public synchronized boolean m50619(C8608 c8608) {
        return ((LinkedHashSet) this.f74400).contains(c8608);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public synchronized void m50620(C8608 c8608) {
        ((LinkedHashSet) this.f74400).add(c8608);
    }

    public C22874(int i) {
        switch (i) {
            case 1:
                this.f74400 = new LinkedHashSet();
                break;
            default:
                this.f74400 = new HashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m50618(C11606 c11606) {
        Class clsM28935 = c11606.m28935();
        HashMap map = (HashMap) this.f74400;
        C11606 c11607 = (C11606) map.get(clsM28935);
        if (c11607 == null) {
            map.put(c11606.m28935(), c11606);
        } else {
            c11607.m28938(c11606);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object m50616(String str) {
        C11606 c11606 = (C11606) ((HashMap) this.f74400).get(C17955.class);
        if (c11606 == null) {
            return null;
        }
        return c11606.m28936(str);
    }
}
