package l;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩹ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes.dex */
public final class C22316 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C5382();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC21341 f72879;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f72881;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Object f72878 = new Object();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC23389 f72880 = null;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C22316(Object obj, InterfaceC21341 interfaceC21341) {
        this.f72881 = obj;
        this.f72879 = interfaceC21341;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22316 m49480(MediaSession.Token token, InterfaceC21341 interfaceC21341) {
        if (token != null) {
            return new C22316(token, interfaceC21341);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.f72881, i);
    }

    public final int hashCode() {
        Object obj = this.f72881;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22316)) {
            return false;
        }
        Object obj2 = ((C22316) obj).f72881;
        Object obj3 = this.f72881;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj3.equals(obj2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object m49484() {
        return this.f72881;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21341 m49481() {
        InterfaceC21341 interfaceC21341;
        synchronized (this.f72878) {
            interfaceC21341 = this.f72879;
        }
        return interfaceC21341;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49482(InterfaceC21341 interfaceC21341) {
        synchronized (this.f72878) {
            this.f72879 = interfaceC21341;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23389 m49485() {
        InterfaceC23389 interfaceC23389;
        synchronized (this.f72878) {
            interfaceC23389 = this.f72880;
        }
        return interfaceC23389;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49483(InterfaceC23389 interfaceC23389) {
        synchronized (this.f72878) {
            this.f72880 = interfaceC23389;
        }
    }
}
