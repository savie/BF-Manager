package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۟ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: YAH1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7640 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Object f25224;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C20340 f25225;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0583 f25226;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20340 f25227;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract C20340 mo20192();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract C20340 mo20193(C20340 c20340);

    public AbstractC7640(C0583 c0583) {
        this.f25226 = c0583;
        c0583.f2551.lock();
        try {
            C20340 c20340Mo20192 = mo20192();
            this.f25227 = c20340Mo20192;
            this.f25224 = c20340Mo20192 == null ? null : c20340Mo20192.f65877;
        } finally {
            c0583.f2551.unlock();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25227 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C20340 c20340Mo20193;
        Object obj;
        C20340 c20340 = this.f25227;
        if (c20340 == null) {
            throw new NoSuchElementException();
        }
        this.f25225 = c20340;
        Object obj2 = this.f25224;
        C0583 c0583 = this.f25226;
        c0583.f2551.lock();
        try {
            C20340 c20341 = this.f25227;
            while (true) {
                c20340Mo20193 = mo20193(c20341);
                obj = null;
                if (c20340Mo20193 != null) {
                    if (c20340Mo20193.f65877 != null) {
                        break;
                    }
                    if (c20340Mo20193 == c20341) {
                        c20340Mo20193 = mo20192();
                        break;
                    }
                    c20341 = c20340Mo20193;
                } else {
                    c20340Mo20193 = null;
                    break;
                }
            }
            this.f25227 = c20340Mo20193;
            if (c20340Mo20193 != null) {
                obj = c20340Mo20193.f65877;
            }
            this.f25224 = obj;
            return obj2;
        } finally {
            c0583.f2551.unlock();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C20340 c20340 = this.f25225;
        if (c20340 == null) {
            throw new IllegalStateException();
        }
        this.f25225 = null;
        C0583 c0583 = this.f25226;
        c0583.f2551.lock();
        try {
            if (c20340.f65877 != null) {
                c0583.m2764(c20340);
            }
        } finally {
            c0583.f2551.unlock();
        }
    }
}
