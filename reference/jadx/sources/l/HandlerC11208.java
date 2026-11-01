package l;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧ᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21WX */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC11208 extends Handler {
    public /* synthetic */ HandlerC11208(int i) {
        this();
    }

    public HandlerC11208() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z;
        ArrayList arrayList = (ArrayList) C14736.f48173.get();
        ArrayList arrayList2 = (ArrayList) C14736.f48174.get();
        int i = message.what;
        if (i == 0) {
            ArrayList arrayList3 = (ArrayList) C14736.f48177.get();
            boolean z2 = arrayList.size() <= 0 && arrayList2.size() <= 0;
            while (arrayList3.size() > 0) {
                ArrayList arrayList4 = (ArrayList) arrayList3.clone();
                arrayList3.clear();
                int size = arrayList4.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C14736 c14736 = (C14736) arrayList4.get(i2);
                    if (c14736.f48184 == 0) {
                        c14736.m35301();
                    } else {
                        arrayList2.add(c14736);
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
        ArrayList arrayList5 = (ArrayList) C14736.f48178.get();
        ArrayList arrayList6 = (ArrayList) C14736.f48175.get();
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C14736 c14737 = (C14736) arrayList2.get(i3);
            if (C14736.m35299(c14737, jCurrentAnimationTimeMillis)) {
                arrayList5.add(c14737);
            }
        }
        int size3 = arrayList5.size();
        if (size3 > 0) {
            for (int i4 = 0; i4 < size3; i4++) {
                C14736 c14738 = (C14736) arrayList5.get(i4);
                c14738.m35301();
                c14738.f48182 = true;
                arrayList2.remove(c14738);
            }
            arrayList5.clear();
        }
        int size4 = arrayList.size();
        int i5 = 0;
        while (i5 < size4) {
            C14736 c14739 = (C14736) arrayList.get(i5);
            if (c14739.m35314(jCurrentAnimationTimeMillis)) {
                arrayList6.add(c14739);
            }
            if (arrayList.size() == size4) {
                i5++;
            } else {
                size4--;
                arrayList6.remove(c14739);
            }
        }
        if (arrayList6.size() > 0) {
            for (int i6 = 0; i6 < arrayList6.size(); i6++) {
                ((C14736) arrayList6.get(i6)).m35306();
            }
            arrayList6.clear();
        }
        if (z) {
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                return;
            }
            sendEmptyMessageDelayed(1, Math.max(0L, C14736.f48180 - (AnimationUtils.currentAnimationTimeMillis() - jCurrentAnimationTimeMillis)));
        }
    }
}
