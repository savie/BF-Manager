package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۤۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M1DS */
/* JADX INFO: loaded from: classes4.dex */
public final class C10597 extends AbstractC1318 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient char[] f33648;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f33649;

    @Override // l.AbstractC1318, l.AbstractC4301, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C10597() {
        this.f33648 = C22532.f72878;
    }

    public C10597(char[] cArr) {
        this.f33648 = cArr;
        this.f33649 = cArr.length;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m27048(char c) {
        char[] cArr = this.f33648;
        int i = this.f33649;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (cArr[i2] == c) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C4632(this);
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC21040 iterator() {
        return new C4632(this);
    }

    @Override // l.AbstractC1318, l.AbstractC4301, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C21786(this);
    }

    @Override // l.AbstractC1318, l.AbstractC4301, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC16321 spliterator() {
        return new C21786(this);
    }

    @Override // l.InterfaceC12835
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo5936(char c) {
        return m27048(c) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f33649;
    }

    @Override // l.AbstractC1318
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo4844(char c) {
        int iM27048 = m27048(c);
        if (iM27048 == -1) {
            return false;
        }
        int i = (this.f33649 - iM27048) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            char[] cArr = this.f33648;
            int i3 = iM27048 + i2;
            cArr[i3] = cArr[i3 + 1];
        }
        this.f33649--;
        return true;
    }

    @Override // l.AbstractC4301, l.InterfaceC12835
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5933(char c) {
        if (m27048(c) != -1) {
            return false;
        }
        int i = this.f33649;
        if (i == this.f33648.length) {
            char[] cArr = new char[i == 0 ? 2 : i * 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                cArr[i2] = this.f33648[i2];
                i = i2;
            }
            this.f33648 = cArr;
        }
        char[] cArr2 = this.f33648;
        int i3 = this.f33649;
        this.f33649 = i3 + 1;
        cArr2[i3] = c;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f33649 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f33649 == 0;
    }

    public final Object clone() {
        try {
            C10597 c10597 = (C10597) super.clone();
            c10597.f33648 = (char[]) this.f33648.clone();
            return c10597;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        char[] cArr = this.f33648;
        for (int i = 0; i < this.f33649; i++) {
            objectOutputStream.writeChar(cArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        char[] cArr = new char[this.f33649];
        this.f33648 = cArr;
        for (int i = 0; i < this.f33649; i++) {
            cArr[i] = objectInputStream.readChar();
        }
    }
}
