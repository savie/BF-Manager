package l;

import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: renamed from: l.ܰۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes3.dex */
public final class C13579 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f44776;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Stack f44774 = new Stack();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Stack f44777 = new Stack();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21445 f44775 = new C21445();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m33195(C4405 c4405) {
        this.f44776++;
        Stack stack = this.f44777;
        stack.push(c4405);
        this.f44774.clear();
        if (stack.size() > 100) {
            stack.remove(0);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m33194() {
        Iterator it = this.f44774.iterator();
        while (it.hasNext()) {
            if (((C4405) it.next()).f15686.startsWith("//SEARCH//")) {
                it.remove();
            }
        }
        Iterator it2 = this.f44777.iterator();
        while (it2.hasNext()) {
            if (((C4405) it2.next()).f15686.startsWith("//SEARCH//")) {
                it2.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m33197() {
        return !this.f44774.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33193() {
        return !this.f44777.isEmpty();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4405 m33196(C4405 c4405) {
        this.f44776++;
        this.f44777.push(c4405);
        return (C4405) this.f44774.pop();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4405 m33190(C4405 c4405) {
        this.f44776++;
        this.f44774.push(c4405);
        return (C4405) this.f44777.pop();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33191(C11018 c11018) {
        Stack<C4405> stack = this.f44774;
        c11018.mo24508(stack.size());
        for (C4405 c4405 : stack) {
            c11018.m27786(c4405.f15686);
            c11018.writeInt(c4405.f15684);
            c11018.m27784(c4405.f15685);
            c11018.m27786(c4405.f15687);
        }
        Stack<C4405> stack2 = this.f44777;
        c11018.mo24508(stack2.size());
        for (C4405 c4406 : stack2) {
            c11018.m27786(c4406.f15686);
            c11018.writeInt(c4406.f15684);
            c11018.m27784(c4406.f15685);
            c11018.m27786(c4406.f15687);
        }
        C21445 c21445 = this.f44775;
        c11018.mo24508(c21445.size());
        for (Map.Entry entry : c21445.entrySet()) {
            c11018.m27786((String) entry.getKey());
            c11018.writeInt(((Integer) entry.getValue()).intValue());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33192(C17367 c17367) {
        Stack stack = this.f44774;
        stack.clear();
        Stack stack2 = this.f44777;
        stack2.clear();
        C21445 c21445 = this.f44775;
        c21445.clear();
        int iM40462 = c17367.m40462();
        for (int i = 0; i < iM40462; i++) {
            stack.add(new C4405(c17367));
        }
        int iM40463 = c17367.m40462();
        for (int i2 = 0; i2 < iM40463; i2++) {
            stack2.add(new C4405(c17367));
        }
        int iM40464 = c17367.m40462();
        for (int i3 = 0; i3 < iM40464; i3++) {
            c21445.put(c17367.m40458(), Integer.valueOf(c17367.readInt()));
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m33189() {
        return this.f44776;
    }
}
