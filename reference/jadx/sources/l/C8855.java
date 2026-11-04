package l;

import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: renamed from: l.۠᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes3.dex */
public final class C8855 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f28935;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Stack f28937 = new Stack();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Stack f28936 = new Stack();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14307 f28934 = new C14307();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m23727(C2889 c2889) {
        this.f28935++;
        Stack stack = this.f28936;
        stack.push(c2889);
        this.f28937.clear();
        if (stack.size() > 100) {
            stack.remove(0);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m23726() {
        Iterator it = this.f28937.iterator();
        while (it.hasNext()) {
            if (((C2889) it.next()).f9476.startsWith("//SEARCH//")) {
                it.remove();
            }
        }
        Iterator it2 = this.f28936.iterator();
        while (it2.hasNext()) {
            if (((C2889) it2.next()).f9476.startsWith("//SEARCH//")) {
                it2.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m23729() {
        return !this.f28937.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23725() {
        return !this.f28936.isEmpty();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2889 m23728(C2889 c2889) {
        this.f28935++;
        this.f28936.push(c2889);
        return (C2889) this.f28937.pop();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2889 m23722(C2889 c2889) {
        this.f28935++;
        this.f28937.push(c2889);
        return (C2889) this.f28936.pop();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23723(C6178 c6178) {
        Stack<C2889> stack = this.f28937;
        c6178.mo17812(stack.size());
        for (C2889 c2889 : stack) {
            c6178.m17800(c2889.f9476);
            c6178.writeInt(c2889.f9478);
            c6178.m17789(c2889.f9475);
            c6178.m17800(c2889.f9477);
        }
        Stack<C2889> stack2 = this.f28936;
        c6178.mo17812(stack2.size());
        for (C2889 c28810 : stack2) {
            c6178.m17800(c28810.f9476);
            c6178.writeInt(c28810.f9478);
            c6178.m17789(c28810.f9475);
            c6178.m17800(c28810.f9477);
        }
        C14307 c14307 = this.f28934;
        c6178.mo17812(c14307.size());
        for (Map.Entry entry : c14307.entrySet()) {
            c6178.m17800((String) entry.getKey());
            c6178.writeInt(((Integer) entry.getValue()).intValue());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23724(C20348 c20348) {
        Stack stack = this.f28937;
        stack.clear();
        Stack stack2 = this.f28936;
        stack2.clear();
        C14307 c14307 = this.f28934;
        c14307.clear();
        int iM46749 = c20348.m46749();
        for (int i = 0; i < iM46749; i++) {
            stack.add(new C2889(c20348));
        }
        int iM467410 = c20348.m46749();
        for (int i2 = 0; i2 < iM467410; i2++) {
            stack2.add(new C2889(c20348));
        }
        int iM467411 = c20348.m46749();
        for (int i3 = 0; i3 < iM467411; i3++) {
            c14307.put(c20348.m46758(), Integer.valueOf(c20348.readInt()));
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m23730() {
        return this.f28935;
    }
}
