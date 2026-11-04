package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ᩴۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAH1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19560 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1661 f63077;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C5390 f63078;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object f63079;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C5390 f63080;

    /* JADX INFO: renamed from: ۙ */
    public abstract C5390 mo31889();

    /* JADX INFO: renamed from: ۙ */
    public abstract C5390 mo31890(C5390 c5390);

    public AbstractC19560(C1661 c1661) {
        this.f63077 = c1661;
        c1661.f5747.lock();
        try {
            C5390 c5390Mo31889 = mo31889();
            this.f63080 = c5390Mo31889;
            this.f63079 = c5390Mo31889 == null ? null : c5390Mo31889.f18879;
        } finally {
            c1661.f5747.unlock();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f63080 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C5390 c5390Mo31890;
        Object obj;
        C5390 c5390 = this.f63080;
        if (c5390 == null) {
            throw new NoSuchElementException();
        }
        this.f63078 = c5390;
        Object obj2 = this.f63079;
        C1661 c1661 = this.f63077;
        c1661.f5747.lock();
        try {
            C5390 c5391 = this.f63080;
            while (true) {
                c5390Mo31890 = mo31890(c5391);
                obj = null;
                if (c5390Mo31890 != null) {
                    if (c5390Mo31890.f18879 != null) {
                        break;
                    }
                    if (c5390Mo31890 == c5391) {
                        c5390Mo31890 = mo31889();
                        break;
                    }
                    c5391 = c5390Mo31890;
                } else {
                    c5390Mo31890 = null;
                    break;
                }
            }
            this.f63080 = c5390Mo31890;
            if (c5390Mo31890 != null) {
                obj = c5390Mo31890.f18879;
            }
            this.f63079 = obj;
            return obj2;
        } finally {
            c1661.f5747.unlock();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C5390 c5390 = this.f63078;
        if (c5390 == null) {
            throw new IllegalStateException();
        }
        this.f63078 = null;
        C1661 c1661 = this.f63077;
        c1661.f5747.lock();
        try {
            if (c5390.f18879 != null) {
                c1661.m5953(c5390);
            }
        } finally {
            c1661.f5747.unlock();
        }
    }
}
