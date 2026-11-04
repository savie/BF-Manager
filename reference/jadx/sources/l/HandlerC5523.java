package l;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚ۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21WX */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC5523 extends Handler {
    public /* synthetic */ HandlerC5523(int i) {
        this();
    }

    public HandlerC5523() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z;
        ArrayList arrayList = (ArrayList) C11488.f36132.get();
        ArrayList arrayList2 = (ArrayList) C11488.f36129.get();
        int i = message.what;
        if (i == 0) {
            ArrayList arrayList3 = (ArrayList) C11488.f36134.get();
            boolean z2 = arrayList.size() <= 0 && arrayList2.size() <= 0;
            while (arrayList3.size() > 0) {
                ArrayList arrayList4 = (ArrayList) arrayList3.clone();
                arrayList3.clear();
                int size = arrayList4.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C11488 c11488 = (C11488) arrayList4.get(i2);
                    if (c11488.f36147 == 0) {
                        c11488.m28857();
                    } else {
                        arrayList2.add(c11488);
                    }
                }
            }
            z = z2;
        } else if (i != 1) {
            return;
        } else {
            z = true;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        ArrayList arrayList5 = (ArrayList) C11488.f36135.get();
        ArrayList arrayList6 = (ArrayList) C11488.f36131.get();
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C11488 c11489 = (C11488) arrayList2.get(i3);
            if (C11488.m28859(c11489, jCurrentAnimationTimeMillis)) {
                arrayList5.add(c11489);
            }
        }
        int size3 = arrayList5.size();
        if (size3 > 0) {
            for (int i4 = 0; i4 < size3; i4++) {
                C11488 c114810 = (C11488) arrayList5.get(i4);
                c114810.m28857();
                c114810.f36143 = true;
                arrayList2.remove(c114810);
            }
            arrayList5.clear();
        }
        int size4 = arrayList.size();
        int i5 = 0;
        while (i5 < size4) {
            C11488 c114811 = (C11488) arrayList.get(i5);
            if (c114811.m28876(jCurrentAnimationTimeMillis)) {
                arrayList6.add(c114811);
            }
            if (arrayList.size() == size4) {
                i5++;
            } else {
                size4--;
                arrayList6.remove(c114811);
            }
        }
        if (arrayList6.size() > 0) {
            for (int i6 = 0; i6 < arrayList6.size(); i6++) {
                ((C11488) arrayList6.get(i6)).m28863();
            }
            arrayList6.clear();
        }
        if (z) {
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                return;
            }
            sendEmptyMessageDelayed(1, Math.max(0L, C11488.f36136 - (AnimationUtils.currentAnimationTimeMillis() - jCurrentAnimationTimeMillis)));
        }
    }
}
