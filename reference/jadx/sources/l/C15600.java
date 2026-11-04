package l;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes4.dex */
public final class C15600 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C20076();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC17335 f50708;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f50710;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f50709 = new Object();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC12239 f50707 = null;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C15600(Object obj, InterfaceC17335 interfaceC17335) {
        this.f50710 = obj;
        this.f50708 = interfaceC17335;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15600 m37329(MediaSession.Token token, InterfaceC17335 interfaceC17335) {
        if (token != null) {
            return new C15600(token, interfaceC17335);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.f50710, i);
    }

    public final int hashCode() {
        Object obj = this.f50710;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15600)) {
            return false;
        }
        Object obj2 = ((C15600) obj).f50710;
        Object obj3 = this.f50710;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj3.equals(obj2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object m37333() {
        return this.f50710;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17335 m37330() {
        InterfaceC17335 interfaceC17335;
        synchronized (this.f50709) {
            interfaceC17335 = this.f50708;
        }
        return interfaceC17335;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37332(InterfaceC17335 interfaceC17335) {
        synchronized (this.f50709) {
            this.f50708 = interfaceC17335;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC12239 m37334() {
        InterfaceC12239 interfaceC12239;
        synchronized (this.f50709) {
            interfaceC12239 = this.f50707;
        }
        return interfaceC12239;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37331(InterfaceC12239 interfaceC12239) {
        synchronized (this.f50709) {
            this.f50707 = interfaceC12239;
        }
    }
}
