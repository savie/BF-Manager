package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7215 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1154 f24039;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23444 f24040;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20424 f24041;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10124 f24042;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10111 f24043;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7215(C23444 c23444, ActivityC5677 activityC5677, C10111 c10111, C10124 c10124, C20424 c20424, C1154 c1154) {
        super(activityC5677, -1);
        this.f24040 = c23444;
        this.f24043 = c10111;
        this.f24042 = c10124;
        this.f24041 = c20424;
        this.f24039 = c1154;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        int i;
        try {
            int i2 = Integer.parseInt(m40352());
            if (i2 <= 0) {
                throw new Exception();
            }
            m40364();
            C10111 c10111 = this.f24043;
            int iMo11507 = c10111.mo11507();
            int i3 = i2 + iMo11507;
            EnumC15236 enumC15236 = EnumC15236.STATIC;
            C10124 c10124 = this.f24042;
            int i4 = !enumC15236.m36501(c10124.mo25750()) ? 1 : 0;
            Iterator<E> it = c10124.mo9699().iterator();
            while (it.hasNext()) {
                i4 = C13571.m33174(((C1428) it.next()).getType()) ? i4 + 2 : i4 + 1;
            }
            int i5 = iMo11507 - i4;
            int i6 = i3 - i4;
            c10111.m25736(i3);
            ArrayList arrayList = new ArrayList();
            if (EnumC15236.STATIC.m36501(c10124.mo25750())) {
                i = 0;
            } else {
                if (i5 >= 16 || i6 >= 16) {
                    arrayList.add(new C8845(EnumC10297.f35278, i5, i6));
                } else {
                    arrayList.add(new C9406(EnumC10297.f35230, i5, i6));
                }
                i = 1;
            }
            for (C1428 c1428 : c10124.mo9699()) {
                int i7 = i5 + i;
                int i8 = i6 + i;
                int i9 = i + 1;
                if (C13571.m33174(c1428.getType())) {
                    i += 2;
                    if (i7 >= 16 || i8 >= 16) {
                        arrayList.add(new C8845(EnumC10297.f35173, i7, i8));
                    } else {
                        arrayList.add(new C9406(EnumC10297.f35115, i7, i8));
                    }
                } else {
                    if (c1428.getType().length() == 1) {
                        if (i7 >= 16 || i8 >= 16) {
                            arrayList.add(new C8845(EnumC10297.f35164, i7, i8));
                        } else {
                            arrayList.add(new C9406(EnumC10297.f35147, i7, i8));
                        }
                    } else if (i7 >= 16 || i8 >= 16) {
                        arrayList.add(new C8845(EnumC10297.f35278, i7, i8));
                    } else {
                        arrayList.add(new C9406(EnumC10297.f35230, i7, i8));
                    }
                    i = i9;
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                c10111.m25731(i10, (AbstractC3384) arrayList.get(i10));
            }
            C14795 c14795 = new C14795();
            C12283 c12283 = new C12283(new C2093(c14795));
            C10547 c10547 = new C10547(this.f24041, c10124, c10111);
            try {
                c10547.m26684(c12283);
                c10547.m26687();
                c14795.m35465(c14795.length() - 1);
                C23444 c23444 = this.f24040;
                InterfaceC2916 interfaceC2916M17000 = c23444.f75915.m17000();
                C1154 c1154 = this.f24039;
                interfaceC2916M17000.replace(c1154.m4246(), c1154.m4251(), c14795);
                c23444.f75915.mo17029(c1154.m4246() + TextUtils.indexOf((CharSequence) c14795, '\n', TextUtils.indexOf((CharSequence) c14795, '\n') + 1));
                c23444.f75915.m17033();
                c23444.f75915.m16886(false);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Exception unused) {
            m40365(R.string.MT_Protector);
        }
    }
}
