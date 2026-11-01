package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.۫ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1DS */
/* JADX INFO: loaded from: classes4.dex */
public final class C12186 extends AbstractC19385 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient char[] f40782;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f40783;

    @Override // l.AbstractC19385, l.AbstractC3861, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C12186() {
        this.f40782 = C17124.f54609;
    }

    public C12186(char[] cArr) {
        this.f40782 = cArr;
        this.f40783 = cArr.length;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m30293(char c) {
        char[] cArr = this.f40782;
        int i = this.f40783;
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

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0190(this);
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15277 iterator() {
        return new C0190(this);
    }

    @Override // l.AbstractC19385, l.AbstractC3861, java.util.Collection, java.lang.Iterable, l.InterfaceC23475, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11687 spliterator() {
        return new C16419(this);
    }

    @Override // l.AbstractC19385, l.AbstractC3861, java.util.Collection, java.lang.Iterable, l.InterfaceC23475, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C16419(this);
    }

    @Override // l.InterfaceC23475
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2286(char c) {
        return m30293(c) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f40783;
    }

    @Override // l.AbstractC19385
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2289(char c) {
        int iM30293 = m30293(c);
        if (iM30293 == -1) {
            return false;
        }
        int i = (this.f40783 - iM30293) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            char[] cArr = this.f40782;
            int i3 = iM30293 + i2;
            cArr[i3] = cArr[i3 + 1];
        }
        this.f40783--;
        return true;
    }

    @Override // l.AbstractC3861, l.InterfaceC23475
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo2291(char c) {
        if (m30293(c) != -1) {
            return false;
        }
        int i = this.f40783;
        if (i == this.f40782.length) {
            char[] cArr = new char[i == 0 ? 2 : i * 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                cArr[i2] = this.f40782[i2];
                i = i2;
            }
            this.f40782 = cArr;
        }
        char[] cArr2 = this.f40782;
        int i3 = this.f40783;
        this.f40783 = i3 + 1;
        cArr2[i3] = c;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f40783 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f40783 == 0;
    }

    public final Object clone() {
        try {
            C12186 c12186 = (C12186) super.clone();
            c12186.f40782 = (char[]) this.f40782.clone();
            return c12186;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        char[] cArr = this.f40782;
        for (int i = 0; i < this.f40783; i++) {
            objectOutputStream.writeChar(cArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        char[] cArr = new char[this.f40783];
        this.f40782 = cArr;
        for (int i = 0; i < this.f40783; i++) {
            cArr[i] = objectInputStream.readChar();
        }
    }
}
