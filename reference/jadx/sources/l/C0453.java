package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡۬۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R5YB */
/* JADX INFO: loaded from: classes3.dex */
public final class C0453 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C10043 f2033;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C22941 f2034;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f2035;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f2036;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f2037;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public HashSet f2038 = new HashSet();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9651 f2039;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7911 f2040;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f2041;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Collection f2042;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C7715 f2043;

    public C0453(AbstractC7911 abstractC7911, C9651 c9651, boolean z) {
        this.f2040 = abstractC7911;
        this.f2039 = c9651;
        this.f2041 = z;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10043 c10043 = new C10043(this.f2040.f26276.m23233());
        c10043.m25920(R.string.MT_Protector);
        c10043.m25929("...");
        c10043.mo25916((Runnable) null);
        c10043.m25932();
        this.f2033 = c10043;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Throwable {
        HashSet hashSet;
        C8002 c8002;
        C8002 c8003;
        int i;
        C9651 c9651;
        C25179 c25179;
        int i2;
        AbstractC7911 abstractC7911 = this.f2040;
        AbstractC22044 abstractC22044M35193 = C14584.m35193(abstractC7911.f26278.m36371(), new String[0]);
        C6265.m17913(abstractC22044M35193, EnumC12230.MODIFY_FILE);
        C22941 c22941 = new C22941(abstractC22044M35193);
        this.f2034 = c22941;
        this.f2042 = c22941.m51742();
        C9651 c9652 = this.f2039;
        C7715 c7715M43873 = C18902.m43873(abstractC22044M35193, c9652 != null);
        this.f2043 = c7715M43873;
        C25179 c25179M20996 = c7715M43873.m20996();
        if (c9652 == null && this.f2041 && this.f2034.m51726()) {
            c25179M20996.m56128(this.f2034);
        }
        if (this.f2034.m51736()) {
            c25179M20996.m56130();
        }
        int size = ((ArrayList) abstractC7911.f26277).size();
        this.f2037 = 0L;
        Iterator it = ((ArrayList) abstractC7911.f26277).iterator();
        while (it.hasNext()) {
            this.f2037 = ((C21120) it.next()).m48215().mo4285() + this.f2037;
        }
        this.f2035 = 0L;
        C25179 c25179M20997 = this.f2043.m20996();
        C3150 c3150 = new C3150();
        if (abstractC7911.f26274) {
            c3150.m10289(this.f2034);
        }
        Iterator it2 = ((ArrayList) abstractC7911.f26277).iterator();
        int i3 = 0;
        while (true) {
            boolean zHasNext = it2.hasNext();
            hashSet = this.f2038;
            if (!zHasNext) {
                break;
            }
            C21120 c21120 = (C21120) it2.next();
            if (this.f2033.m27399()) {
                break;
            }
            int i4 = i3 + 1;
            String strM48220 = c21120.m48220();
            AbstractC22044 abstractC22044M48215 = c21120.m48215();
            Iterator it3 = it2;
            Iterator it4 = this.f2042.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    c8002 = null;
                    break;
                }
                c8002 = (C8002) it4.next();
                Iterator it5 = it4;
                if (c8002.getName().equals(strM48220)) {
                    break;
                } else {
                    it4 = it5;
                }
            }
            if (c8002 == null) {
                c25179M20997.m56135(abstractC7911.f26274 ? C20304.m46644(strM48220, c3150) : 8);
                c25179M20997.m56139((String) null);
                c8003 = new C8002(strM48220);
            } else {
                c25179M20997.m56135(c8002.m21826());
                if (c8002.m21856()) {
                    c25179M20997.m56139(abstractC7911.f26278.m36372());
                } else {
                    c25179M20997.m56139((String) null);
                }
                c8003 = c8002;
            }
            C3150 c3151 = c3150;
            C10043 c10043 = this.f2033;
            AbstractC22044 abstractC22044 = abstractC22044M35193;
            StringBuilder sb = new StringBuilder();
            AbstractC7911 abstractC7912 = abstractC7911;
            sb.append(C21576.m49088(R.string.MT_Protector));
            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
            sb.append(i4);
            sb.append("/");
            sb.append(size);
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            c10043.m25926(sb.toString());
            this.f2033.m25929(strM48220);
            InputStream inputStreamMo4290 = abstractC22044M48215.mo4290();
            try {
                long jMo4285 = abstractC22044M48215.mo4285();
                c8003.m21854(jMo4285);
                int i5 = i4;
                c8003.setTime(abstractC22044M48215.mo4286());
                c25179M20997.m56125(c8003);
                byte[] bArr = new byte[4096];
                long j = 0;
                while (true) {
                    int i6 = inputStreamMo4290.read(bArr);
                    if (i6 > 0) {
                        i = i5;
                        c25179M20997.write(bArr, 0, i6);
                        c9651 = c9652;
                        c25179 = c25179M20996;
                        j += (long) i6;
                        this.f2033.m25927(j, c8003.getSize());
                        i2 = size;
                        byte[] bArr2 = bArr;
                        C8002 c8004 = c8003;
                        this.f2033.m25919(this.f2035 + j, this.f2037);
                        if (this.f2033.m27399()) {
                            break;
                        }
                        c9652 = c9651;
                        bArr = bArr2;
                        i5 = i;
                        c25179M20996 = c25179;
                        size = i2;
                        c8003 = c8004;
                    } else {
                        i = i5;
                        c9651 = c9652;
                        c25179 = c25179M20996;
                        i2 = size;
                        c25179M20997.m56134();
                        break;
                    }
                }
                this.f2035 += jMo4285;
                inputStreamMo4290.close();
                hashSet.add(strM48220);
                c9652 = c9651;
                it2 = it3;
                c3150 = c3151;
                abstractC22044M35193 = abstractC22044;
                i3 = i;
                abstractC7911 = abstractC7912;
                c25179M20996 = c25179;
                size = i2;
            } catch (Throwable th) {
                if (inputStreamMo4290 == null) {
                    throw th;
                }
                try {
                    inputStreamMo4290.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        AbstractC7911 abstractC7913 = abstractC7911;
        final AbstractC22044 abstractC22045 = abstractC22044M35193;
        C9651 c9653 = c9652;
        C25179 c251710 = c25179M20996;
        if (this.f2033.m27399()) {
            return;
        }
        C25179 c25179M20998 = this.f2043.m20996();
        C18352 c18352 = new C18352(this, C18902.m43870(this.f2042));
        int i7 = 0;
        for (C8002 c8005 : this.f2042) {
            if (this.f2033.m27399()) {
                break;
            }
            i7++;
            if (hashSet.contains(c8005.getName())) {
                if (!c8005.isDirectory()) {
                    this.f2036 = c8005.m21838() + this.f2036;
                }
            } else {
                this.f2033.m25926(C21576.m49088(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i7 + "/" + this.f2042.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                this.f2033.m25929(c8005.getName());
                if (c8005.isDirectory()) {
                    c25179M20998.m56125(c8005);
                } else {
                    C18902.m43878(c8005, this.f2034, c25179M20998, c18352);
                    this.f2036 = c8005.m21838() + this.f2036;
                }
            }
        }
        if (this.f2033.m27399()) {
            return;
        }
        c251710.close();
        if (c9653 != null) {
            C0938.m3743(abstractC7913.f26276.m23233(), this.f2043, c9653, this.f2033);
        }
        C24808.m55331(abstractC22045);
        C24523 c24523 = new C24523();
        c24523.m54796(abstractC22045);
        this.f2043.m20995(abstractC22045, new Runnable() { // from class: l.᩶۬۫
            @Override // java.lang.Runnable
            public final void run() {
                C0453 c0453 = this.f67982;
                c0453.f2033.m25920(R.string.MT_Protector);
                c0453.f2033.m25929(abstractC22045.getName());
            }
        }, this.f2034);
        c24523.m54797(abstractC22045);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        boolean zM27399 = this.f2033.m27399();
        AbstractC7911 abstractC7911 = this.f2040;
        if (!zM27399) {
            abstractC7911.f26276.m23209();
            ArrayList arrayList = new ArrayList(((ArrayList) abstractC7911.f26277).size());
            Iterator it = ((ArrayList) abstractC7911.f26277).iterator();
            while (it.hasNext()) {
                arrayList.add(((C21120) it.next()).m48221());
            }
            abstractC7911.f26276.m23176((Collection) arrayList);
            abstractC7911.f26276.m23216();
            C8656 c8656 = (C8656) abstractC7911;
            Iterator it2 = c8656.f28260.iterator();
            while (it2.hasNext()) {
                ((C21120) it2.next()).m48218();
            }
            c8656.f28261.f49287 = false;
            return;
        }
        C7715 c7715 = this.f2043;
        if (c7715 != null) {
            C20244.m46520(c7715.m20996());
            this.f2043.m20994().mo4296();
        }
        abstractC7911.mo21451();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        C7715 c7715 = this.f2043;
        if (c7715 != null) {
            C20244.m46520(c7715.m20996());
            this.f2043.m20994().mo4296();
        }
        C22673.m51160(exc.toString());
        this.f2040.mo21451();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C20244.m46520(this.f2034);
        this.f2033.m27405();
        C6331.m18055();
    }
}
