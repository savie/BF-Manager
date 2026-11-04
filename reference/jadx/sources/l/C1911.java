package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.֫ۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S6E */
/* JADX INFO: loaded from: classes3.dex */
public final class C1911 extends AbstractC7372 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient float[] f6437;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f6438;

    @Override // l.AbstractC7372, l.AbstractC0660, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C1911() {
        this.f6437 = C11605.f36438;
    }

    public C1911(float[] fArr) {
        this.f6437 = fArr;
        this.f6438 = fArr.length;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m6578(float f) {
        float[] fArr = this.f6437;
        int i = this.f6438;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (Float.floatToRawIntBits(fArr[i2]) == Float.floatToRawIntBits(f)) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // l.AbstractC0660, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C13097(this);
    }

    @Override // l.AbstractC0660, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC9367 iterator() {
        return new C13097(this);
    }

    @Override // l.AbstractC7372, l.AbstractC0660, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C5640(this);
    }

    @Override // l.AbstractC7372, l.AbstractC0660, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC15906 spliterator() {
        return new C5640(this);
    }

    @Override // l.InterfaceC17572
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo6580(float f) {
        return m6578(f) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f6438;
    }

    @Override // l.AbstractC7372
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo6579(float f) {
        int iM6578 = m6578(f);
        if (iM6578 == -1) {
            return false;
        }
        int i = (this.f6438 - iM6578) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            float[] fArr = this.f6437;
            int i3 = iM6578 + i2;
            fArr[i3] = fArr[i3 + 1];
        }
        this.f6438--;
        return true;
    }

    @Override // l.AbstractC0660, l.InterfaceC17572
    public final boolean add(float f) {
        if (m6578(f) != -1) {
            return false;
        }
        int i = this.f6438;
        if (i == this.f6437.length) {
            float[] fArr = new float[i == 0 ? 2 : i * 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                fArr[i2] = this.f6437[i2];
                i = i2;
            }
            this.f6437 = fArr;
        }
        float[] fArr2 = this.f6437;
        int i3 = this.f6438;
        this.f6438 = i3 + 1;
        fArr2[i3] = f;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f6438 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f6438 == 0;
    }

    public final Object clone() {
        try {
            C1911 c1911 = (C1911) super.clone();
            c1911.f6437 = (float[]) this.f6437.clone();
            return c1911;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        float[] fArr = this.f6437;
        for (int i = 0; i < this.f6438; i++) {
            objectOutputStream.writeFloat(fArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        float[] fArr = new float[this.f6438];
        this.f6437 = fArr;
        for (int i = 0; i < this.f6438; i++) {
            fArr[i] = objectInputStream.readFloat();
        }
    }
}
