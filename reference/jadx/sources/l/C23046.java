package l;

import com.umeng.analytics.pro.bo;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes.dex */
public final class C23046 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8229 f74864;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f74866 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f74865 = new ArrayList();

    public C23046(C8229 c8229) {
        this.f74864 = c8229;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50978() {
        for (C19146 c19146 : ((HashMap) this.f74864.f28645).values()) {
            if (c19146.f61839 != null) {
                this.f74865.add(c19146);
            } else if (c19146.f61844 != null) {
                this.f74866.add(c19146);
            } else {
                throw new IOException("Bad xml item: " + c19146.f61840);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] m50979() {
        ArrayList arrayList = this.f74866;
        Collections.sort(arrayList);
        ArrayList<C19146> arrayList2 = this.f74865;
        Collections.sort(arrayList2);
        MessageDigest messageDigestM49421 = C22253.m49421();
        messageDigestM49421.update((byte) -127);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            messageDigestM49421.update(((C19146) it.next()).f61840.getBytes(Charset.defaultCharset()));
        }
        messageDigestM49421.update(bo.h);
        for (C19146 c19146 : arrayList2) {
            messageDigestM49421.update(c19146.f61840.getBytes(Charset.defaultCharset()));
            messageDigestM49421.update(c19146.f61839.m33327());
        }
        messageDigestM49421.update((byte) -123);
        return messageDigestM49421.digest();
    }
}
