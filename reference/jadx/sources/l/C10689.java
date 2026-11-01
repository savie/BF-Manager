package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.ۧ֫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 122L */
/* JADX INFO: loaded from: classes3.dex */
public final class C10689 extends AbstractC5749 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f36496;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f36497;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Parcel f36498;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f36499;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final SparseIntArray f36500;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f36501;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f36502;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f36503;

    public C10689(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C21445(), new C21445(), new C21445());
    }

    public C10689(Parcel parcel, int i, int i2, String str, C21445 c21445, C21445 c21446, C21445 c21447) {
        super(c21445, c21446, c21447);
        this.f36500 = new SparseIntArray();
        this.f36497 = -1;
        this.f36502 = -1;
        this.f36498 = parcel;
        this.f36501 = i;
        this.f36499 = i2;
        this.f36496 = i;
        this.f36503 = str;
    }

    @Override // l.AbstractC5749
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15827(int i) {
        while (this.f36496 < this.f36499) {
            int i2 = this.f36502;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f36496;
            Parcel parcel = this.f36498;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.f36502 = parcel.readInt();
            this.f36496 += i4;
        }
        return this.f36502 == i;
    }

    @Override // l.AbstractC5749
    /* JADX INFO: renamed from: ܰ */
    public final void mo15837(int i) {
        mo15822();
        this.f36497 = i;
        this.f36500.put(i, this.f36498.dataPosition());
        mo15831(0);
        mo15831(i);
    }

    @Override // l.AbstractC5749
    /* JADX INFO: renamed from: ۙ */
    public final void mo15822() {
        int i = this.f36497;
        if (i >= 0) {
            int i2 = this.f36500.get(i);
            Parcel parcel = this.f36498;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(iDataPosition - i2);
            parcel.setDataPosition(iDataPosition);
        }
    }

    @Override // l.AbstractC5749
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC5749 mo15836() {
        Parcel parcel = this.f36498;
        int iDataPosition = parcel.dataPosition();
        int i = this.f36496;
        if (i == this.f36501) {
            i = this.f36499;
        }
        return new C10689(parcel, iDataPosition, i, C22697.m50267(new StringBuilder(), this.f36503, EnumC19730.f63352), this.f19547, this.f19546, this.f19545);
    }

    @Override // l.AbstractC5749
    /* JADX INFO: renamed from: ܰ */
    public final void mo15844(byte[] bArr) {
        Parcel parcel = this.f36498;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        } else {
            parcel.writeInt(-1);
        }
    }

    @Override // l.AbstractC5749
    /* JADX INFO: renamed from: ۨ */
    public final void mo15831(int i) {
        this.f36498.writeInt(i);
    }

    @Override // l.AbstractC5749
    /* JADX INFO: renamed from: ۙ */
    public final void mo15825(String str) {
        this.f36498.writeString(str);
    }

    @Override // l.AbstractC5749
    /* JADX INFO: renamed from: ۙ */
    public final void mo15823(Parcelable parcelable) {
        this.f36498.writeParcelable(parcelable, 0);
    }

    @Override // l.AbstractC5749
    /* JADX INFO: renamed from: ۙ */
    public final void mo15826(boolean z) {
        this.f36498.writeInt(z ? 1 : 0);
    }

    @Override // l.AbstractC5749
    /* JADX INFO: renamed from: ۙ */
    public final void mo15824(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f36498, 0);
    }

    @Override // l.AbstractC5749
    /* JADX INFO: renamed from: ۚ */
    public final CharSequence mo15830() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f36498);
    }

    @Override // l.AbstractC5749
    /* JADX INFO: renamed from: ᩹ */
    public final int mo15845() {
        return this.f36498.readInt();
    }

    @Override // l.AbstractC5749
    /* JADX INFO: renamed from: ۬ */
    public final String mo15835() {
        return this.f36498.readString();
    }

    @Override // l.AbstractC5749
    /* JADX INFO: renamed from: ۖ */
    public final byte[] mo15815() {
        Parcel parcel = this.f36498;
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // l.AbstractC5749
    /* JADX INFO: renamed from: ֨ */
    public final Parcelable mo15814() {
        return this.f36498.readParcelable(C10689.class.getClassLoader());
    }

    @Override // l.AbstractC5749
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo15834() {
        return this.f36498.readInt() != 0;
    }
}
