package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.֫ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6E */
/* JADX INFO: loaded from: classes3.dex */
public final class C1808 extends AbstractC15921 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient float[] f6964;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f6965;

    @Override // l.AbstractC15921, l.AbstractC18036, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C1808() {
        this.f6964 = C9571.f32283;
    }

    public C1808(float[] fArr) {
        this.f6964 = fArr;
        this.f6965 = fArr.length;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m5898(float f) {
        float[] fArr = this.f6964;
        int i = this.f6965;
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

    @Override // l.AbstractC18036, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C23682(this);
    }

    @Override // l.AbstractC18036, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC10007 iterator() {
        return new C23682(this);
    }

    @Override // l.AbstractC15921, l.AbstractC18036, java.util.Collection, java.lang.Iterable, l.InterfaceC13535, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11501 spliterator() {
        return new C14510(this);
    }

    @Override // l.AbstractC15921, l.AbstractC18036, java.util.Collection, java.lang.Iterable, l.InterfaceC13535, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C14510(this);
    }

    @Override // l.InterfaceC13535
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean mo5900(float f) {
        return m5898(f) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f6965;
    }

    @Override // l.AbstractC15921
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo5899(float f) {
        int iM5898 = m5898(f);
        if (iM5898 == -1) {
            return false;
        }
        int i = (this.f6965 - iM5898) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            float[] fArr = this.f6964;
            int i3 = iM5898 + i2;
            fArr[i3] = fArr[i3 + 1];
        }
        this.f6965--;
        return true;
    }

    @Override // l.AbstractC18036, l.InterfaceC13535
    public final boolean add(float f) {
        if (m5898(f) != -1) {
            return false;
        }
        int i = this.f6965;
        if (i == this.f6964.length) {
            float[] fArr = new float[i == 0 ? 2 : i * 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                fArr[i2] = this.f6964[i2];
                i = i2;
            }
            this.f6964 = fArr;
        }
        float[] fArr2 = this.f6964;
        int i3 = this.f6965;
        this.f6965 = i3 + 1;
        fArr2[i3] = f;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f6965 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f6965 == 0;
    }

    public final Object clone() {
        try {
            C1808 c1808 = (C1808) super.clone();
            c1808.f6964 = (float[]) this.f6964.clone();
            return c1808;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        float[] fArr = this.f6964;
        for (int i = 0; i < this.f6965; i++) {
            objectOutputStream.writeFloat(fArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        float[] fArr = new float[this.f6965];
        this.f6964 = fArr;
        for (int i = 0; i < this.f6965; i++) {
            fArr[i] = objectInputStream.readFloat();
        }
    }
}
