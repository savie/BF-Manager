package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.᩵۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 122L */
/* JADX INFO: loaded from: classes5.dex */
public final class C20444 extends AbstractC3290 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Parcel f65481;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f65482;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final SparseIntArray f65483;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f65484;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f65485;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f65486;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f65487;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f65488;

    public C20444(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C14307(), new C14307(), new C14307());
    }

    public C20444(Parcel parcel, int i, int i2, String str, C14307 c14307, C14307 c14308, C14307 c14309) {
        super(c14307, c14308, c14309);
        this.f65483 = new SparseIntArray();
        this.f65487 = -1;
        this.f65485 = -1;
        this.f65481 = parcel;
        this.f65482 = i;
        this.f65486 = i2;
        this.f65484 = i;
        this.f65488 = str;
    }

    @Override // l.AbstractC3290
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo10848(int i) {
        while (this.f65484 < this.f65486) {
            int i2 = this.f65485;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f65484;
            Parcel parcel = this.f65481;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.f65485 = parcel.readInt();
            this.f65484 += i4;
        }
        return this.f65485 == i;
    }

    @Override // l.AbstractC3290
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10860(int i) {
        mo10843();
        this.f65487 = i;
        this.f65483.put(i, this.f65481.dataPosition());
        mo10852(0);
        mo10852(i);
    }

    @Override // l.AbstractC3290
    /* JADX INFO: renamed from: ۙ */
    public final void mo10843() {
        int i = this.f65487;
        if (i >= 0) {
            int i2 = this.f65483.get(i);
            Parcel parcel = this.f65481;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(iDataPosition - i2);
            parcel.setDataPosition(iDataPosition);
        }
    }

    @Override // l.AbstractC3290
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC3290 mo10859() {
        Parcel parcel = this.f65481;
        int iDataPosition = parcel.dataPosition();
        int i = this.f65484;
        if (i == this.f65482) {
            i = this.f65486;
        }
        return new C20444(parcel, iDataPosition, i, C8947.m23910(new StringBuilder(), this.f65488, EnumC7687.f25319), this.f10715, this.f10714, this.f10713);
    }

    @Override // l.AbstractC3290
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10867(byte[] bArr) {
        Parcel parcel = this.f65481;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        } else {
            parcel.writeInt(-1);
        }
    }

    @Override // l.AbstractC3290
    /* JADX INFO: renamed from: ۤ */
    public final void mo10852(int i) {
        this.f65481.writeInt(i);
    }

    @Override // l.AbstractC3290
    /* JADX INFO: renamed from: ۙ */
    public final void mo10846(String str) {
        this.f65481.writeString(str);
    }

    @Override // l.AbstractC3290
    /* JADX INFO: renamed from: ۙ */
    public final void mo10844(Parcelable parcelable) {
        this.f65481.writeParcelable(parcelable, 0);
    }

    @Override // l.AbstractC3290
    /* JADX INFO: renamed from: ۙ */
    public final void mo10847(boolean z) {
        this.f65481.writeInt(z ? 1 : 0);
    }

    @Override // l.AbstractC3290
    /* JADX INFO: renamed from: ۙ */
    public final void mo10845(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f65481, 0);
    }

    @Override // l.AbstractC3290
    /* JADX INFO: renamed from: ᩴ */
    public final CharSequence mo10858() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f65481);
    }

    @Override // l.AbstractC3290
    /* JADX INFO: renamed from: ܳ */
    public final int mo10857() {
        return this.f65481.readInt();
    }

    @Override // l.AbstractC3290
    /* JADX INFO: renamed from: ۚ */
    public final String mo10851() {
        return this.f65481.readString();
    }

    @Override // l.AbstractC3290
    /* JADX INFO: renamed from: ᩸ */
    public final byte[] mo10868() {
        Parcel parcel = this.f65481;
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // l.AbstractC3290
    /* JADX INFO: renamed from: ۫ */
    public final Parcelable mo10856() {
        return this.f65481.readParcelable(C20444.class.getClassLoader());
    }

    @Override // l.AbstractC3290
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo10855() {
        return this.f65481.readInt() != 0;
    }
}
