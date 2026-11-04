package l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.google.android.material.chip.Chip;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: l.֡ۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G5Y2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0329 implements Cloneable {
    public static final boolean DBG = false;
    public static final String LOG_TAG = "Transition";
    public static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    public static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    public static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    public static final String MATCH_ITEM_ID_STR = "itemId";
    public static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    public static final String MATCH_NAME_STR = "name";
    public ArrayList mEndValuesList;
    public AbstractC23450 mEpicenterCallback;
    public InterfaceC12261[] mListenersCache;
    public C14307 mNameOverrides;
    public AbstractC9277 mPropagation;
    public C20466 mSeekController;
    public long mSeekOffsetInParent;
    public ArrayList mStartValuesList;
    public long mTotalDuration;
    public static final Animator[] EMPTY_ANIMATOR_ARRAY = new Animator[0];
    public static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    public static final AbstractC19720 STRAIGHT_PATH_MOTION = new C11515();
    public static ThreadLocal sRunningAnimators = new ThreadLocal();
    public String mName = getClass().getName();
    public long mStartDelay = -1;
    public long mDuration = -1;
    public TimeInterpolator mInterpolator = null;
    public ArrayList mTargetIds = new ArrayList();
    public ArrayList mTargets = new ArrayList();
    public ArrayList mTargetNames = null;
    public ArrayList mTargetTypes = null;
    public ArrayList mTargetIdExcludes = null;
    public ArrayList mTargetExcludes = null;
    public ArrayList mTargetTypeExcludes = null;
    public ArrayList mTargetNameExcludes = null;
    public ArrayList mTargetIdChildExcludes = null;
    public ArrayList mTargetChildExcludes = null;
    public ArrayList mTargetTypeChildExcludes = null;
    public C19524 mStartValues = new C19524();
    public C19524 mEndValues = new C19524();
    public C4608 mParent = null;
    public int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    public boolean mCanRemoveViews = false;
    public ArrayList mCurrentAnimators = new ArrayList();
    public Animator[] mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
    public int mNumInstances = 0;
    public boolean mPaused = false;
    public boolean mEnded = false;
    public AbstractC0329 mCloneParent = null;
    public ArrayList mListeners = null;
    public ArrayList mAnimators = new ArrayList();
    public AbstractC19720 mPathMotion = STRAIGHT_PATH_MOTION;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m2037(int i) {
        return i >= 1 && i <= 4;
    }

    public abstract void captureEndValues(C22508 c22508);

    public void capturePropagationValues(C22508 c22508) {
    }

    public abstract void captureStartValues(C22508 c22508);

    public Animator createAnimator(ViewGroup viewGroup, C22508 c22508, C22508 c22509) {
        return null;
    }

    public AbstractC9277 getPropagation() {
        return null;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public boolean isSeekingSupported() {
        return false;
    }

    public void setPropagation(AbstractC9277 abstractC9277) {
    }

    public AbstractC0329() {
    }

    public AbstractC0329(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1821.f6176);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jM8386 = C2506.m8386(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jM8386 >= 0) {
            setDuration(jM8386);
        }
        long j = xmlResourceParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "startDelay") != null ? typedArrayObtainStyledAttributes.getInt(2, -1) : -1;
        if (j > 0) {
            setStartDelay(j);
        }
        int resourceId = xmlResourceParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "interpolator") != null ? typedArrayObtainStyledAttributes.getResourceId(0, 0) : 0;
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        String strM8388 = C2506.m8388(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strM8388 != null) {
            setMatchOrder(m2040(strM8388));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m2040(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(strTrim)) {
                iArr[i] = 3;
            } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(strTrim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(strTrim)) {
                iArr[i] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(strTrim)) {
                iArr[i] = 4;
            } else {
                if (!strTrim.isEmpty()) {
                    throw new InflateException(C14442.m34865("Unknown match type in matchOrder: '", strTrim, "'"));
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            }
            i++;
        }
        return iArr;
    }

    public final AbstractC0329 getRootTransition() {
        C4608 c4608 = this.mParent;
        return c4608 != null ? c4608.getRootTransition() : this;
    }

    public AbstractC0329 setDuration(long j) {
        this.mDuration = j;
        return this;
    }

    public long getDuration() {
        return this.mDuration;
    }

    public AbstractC0329 setStartDelay(long j) {
        this.mStartDelay = j;
        return this;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    public AbstractC0329 setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public InterfaceC2566 createSeekController() {
        C20466 c20466 = new C20466(this);
        this.mSeekController = c20466;
        addListener(c20466);
        return this.mSeekController;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (!m2037(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (m2039(iArr, i)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m2039(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m2041(C14307 c14307, C14307 c14308) {
        C22508 c22508;
        int size = c14307.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            View view = (View) c14307.m24220(size);
            if (view != null && isValidTarget(view) && (c22508 = (C22508) c14308.remove(view)) != null && isValidTarget(c22508.f72817)) {
                this.mStartValuesList.add((C22508) c14307.m24222(size));
                this.mEndValuesList.add(c22508);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2034(C14307 c14307, C14307 c14308, C18783 c18783, C18783 c18784) {
        View view;
        int iM43578 = c18783.m43578();
        for (int i = 0; i < iM43578; i++) {
            View view2 = (View) c18783.m43577(i);
            if (view2 != null && isValidTarget(view2) && (view = (View) c18784.m43573(c18783.m43572(i))) != null && isValidTarget(view)) {
                C22508 c22508 = (C22508) c14307.get(view2);
                C22508 c22509 = (C22508) c14308.get(view);
                if (c22508 != null && c22509 != null) {
                    this.mStartValuesList.add(c22508);
                    this.mEndValuesList.add(c22509);
                    c14307.remove(view2);
                    c14308.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2032(C14307 c14307, C14307 c14308, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) sparseArray.valueAt(i);
            if (view2 != null && isValidTarget(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i))) != null && isValidTarget(view)) {
                C22508 c22508 = (C22508) c14307.get(view2);
                C22508 c22509 = (C22508) c14308.get(view);
                if (c22508 != null && c22509 != null) {
                    this.mStartValuesList.add(c22508);
                    this.mEndValuesList.add(c22509);
                    c14307.remove(view2);
                    c14308.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2033(C14307 c14307, C14307 c14308, C14307 c14309, C14307 c143010) {
        View view;
        int size = c14309.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) c14309.m24221(i);
            if (view2 != null && isValidTarget(view2) && (view = (View) c143010.get(c14309.m24220(i))) != null && isValidTarget(view)) {
                C22508 c22508 = (C22508) c14307.get(view2);
                C22508 c22509 = (C22508) c14308.get(view);
                if (c22508 != null && c22509 != null) {
                    this.mStartValuesList.add(c22508);
                    this.mEndValuesList.add(c22509);
                    c14307.remove(view2);
                    c14308.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2031(C14307 c14307, C14307 c14308) {
        for (int i = 0; i < c14307.size(); i++) {
            C22508 c22508 = (C22508) c14307.m24221(i);
            if (isValidTarget(c22508.f72817)) {
                this.mStartValuesList.add(c22508);
                this.mEndValuesList.add(null);
            }
        }
        for (int i2 = 0; i2 < c14308.size(); i2++) {
            C22508 c22509 = (C22508) c14308.m24221(i2);
            if (isValidTarget(c22509.f72817)) {
                this.mEndValuesList.add(c22509);
                this.mStartValuesList.add(null);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2036(C19524 c19524, C19524 c19525) {
        C14307 c14307 = new C14307(c19524.f63002);
        C14307 c14308 = new C14307(c19525.f63002);
        int i = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m2041(c14307, c14308);
                } else if (i2 == 2) {
                    m2033(c14307, c14308, c19524.f63000, c19525.f63000);
                } else if (i2 == 3) {
                    m2032(c14307, c14308, c19524.f62999, c19525.f62999);
                } else if (i2 == 4) {
                    m2034(c14307, c14308, c19524.f63001, c19525.f63001);
                }
                i++;
            } else {
                m2031(c14307, c14308);
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:71:0x010d A[SYNTHETIC] */
    public void createAnimators(ViewGroup viewGroup, C19524 c19524, C19524 c19525, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        C22508 c22508;
        Object obj;
        C14307 c14307M2027 = m2027();
        SparseIntArray sparseIntArray = new SparseIntArray();
        boolean z = getRootTransition().mSeekController != null;
        int i = 0;
        for (int size = arrayList.size(); i < size; size = size) {
            C22508 c22509 = (C22508) arrayList.get(i);
            C22508 c225010 = (C22508) arrayList2.get(i);
            if (c22509 != null && !c22509.f72816.contains(this)) {
                c22509 = null;
            }
            if (c225010 != null && !c225010.f72816.contains(this)) {
                c225010 = null;
            }
            if ((c22509 != null || c225010 != null) && (c22509 == null || c225010 == null || isTransitionRequired(c22509, c225010))) {
                Animator animatorCreateAnimator = createAnimator(viewGroup, c22509, c225010);
                if (animatorCreateAnimator != null) {
                    if (c225010 != null) {
                        view = c225010.f72817;
                        String[] transitionProperties = getTransitionProperties();
                        if (transitionProperties != null && transitionProperties.length > 0) {
                            c22508 = new C22508(view);
                            C22508 c225011 = (C22508) c19525.f63002.get(view);
                            if (c225011 != null) {
                                for (String str : transitionProperties) {
                                    c22508.f72818.put(str, c225011.f72818.get(str));
                                }
                            }
                            int size2 = c14307M2027.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                C17482 c17482 = (C17482) c14307M2027.get((Animator) c14307M2027.m24220(i2));
                                if (c17482.f56828 != null && c17482.f56826 == view && c17482.f56827.equals(getName()) && c17482.f56828.equals(c22508)) {
                                    animatorCreateAnimator = null;
                                    break;
                                }
                            }
                        }
                        if (animatorCreateAnimator != null) {
                            String name = getName();
                            WindowId windowId = viewGroup.getWindowId();
                            C17482 c17483 = new C17482();
                            c17483.f56826 = view;
                            c17483.f56827 = name;
                            c17483.f56828 = c22508;
                            c17483.f56825 = windowId;
                            c17483.f56824 = this;
                            c17483.f56823 = animatorCreateAnimator;
                            if (z) {
                                obj = animatorCreateAnimator;
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.play(animatorCreateAnimator);
                                obj = animatorSet;
                            }
                            obj = animatorCreateAnimator;
                            c14307M2027.put(obj, c17483);
                            this.mAnimators.add(obj);
                        }
                    } else {
                        view = c22509.f72817;
                    }
                    c22508 = null;
                    if (animatorCreateAnimator != null) {
                        String name2 = getName();
                        WindowId windowId2 = viewGroup.getWindowId();
                        C17482 c17484 = new C17482();
                        c17484.f56826 = view;
                        c17484.f56827 = name2;
                        c17484.f56828 = c22508;
                        c17484.f56825 = windowId2;
                        c17484.f56824 = this;
                        c17484.f56823 = animatorCreateAnimator;
                        if (z) {
                            obj = animatorCreateAnimator;
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.play(animatorCreateAnimator);
                            obj = animatorSet2;
                        }
                        obj = animatorCreateAnimator;
                        c14307M2027.put(obj, c17484);
                        this.mAnimators.add(obj);
                    }
                }
                i++;
            }
            size = size;
            i++;
        }
        if (sparseIntArray.size() != 0) {
            for (int i3 = 0; i3 < sparseIntArray.size(); i3++) {
                C17482 c17485 = (C17482) c14307M2027.get((Animator) this.mAnimators.get(sparseIntArray.keyAt(i3)));
                c17485.f56823.setStartDelay(c17485.f56823.getStartDelay() + (((long) sparseIntArray.valueAt(i3)) - C25227.FOREVER_NS));
            }
        }
    }

    public boolean isValidTarget(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.mTargetTypeExcludes.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null && C22666.m51109(view) != null && this.mTargetNameExcludes.contains(C22666.m51109(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(C22666.m51109(view))) {
            return true;
        }
        if (this.mTargetTypes != null) {
            for (int i2 = 0; i2 < this.mTargetTypes.size(); i2++) {
                if (((Class) this.mTargetTypes.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14307 m2027() {
        C14307 c14307 = (C14307) sRunningAnimators.get();
        if (c14307 != null) {
            return c14307;
        }
        C14307 c14308 = new C14307();
        sRunningAnimators.set(c14308);
        return c14308;
    }

    public void runAnimators() {
        start();
        C14307 c14307M2027 = m2027();
        for (Animator animator : this.mAnimators) {
            if (c14307M2027.containsKey(animator)) {
                start();
                m2028(animator, c14307M2027);
            }
        }
        this.mAnimators.clear();
        end();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2028(Animator animator, C14307 c14307) {
        if (animator != null) {
            animator.addListener(new C24942(this, c14307));
            animate(animator);
        }
    }

    public void prepareAnimatorsForSeeking() {
        C14307 c14307M2027 = m2027();
        this.mTotalDuration = 0L;
        for (int i = 0; i < this.mAnimators.size(); i++) {
            Animator animator = (Animator) this.mAnimators.get(i);
            C17482 c17482 = (C17482) c14307M2027.get(animator);
            if (animator != null && c17482 != null) {
                Animator animator2 = c17482.f56823;
                if (getDuration() >= 0) {
                    animator2.setDuration(getDuration());
                }
                if (getStartDelay() >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + getStartDelay());
                }
                if (getInterpolator() != null) {
                    animator2.setInterpolator(getInterpolator());
                }
                this.mCurrentAnimators.add(animator);
                this.mTotalDuration = Math.max(this.mTotalDuration, C3312.m10926(animator));
            }
        }
        this.mAnimators.clear();
    }

    public AbstractC0329 addTarget(View view) {
        this.mTargets.add(view);
        return this;
    }

    public AbstractC0329 addTarget(int i) {
        if (i != 0) {
            this.mTargetIds.add(Integer.valueOf(i));
        }
        return this;
    }

    public AbstractC0329 addTarget(String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList();
        }
        this.mTargetNames.add(str);
        return this;
    }

    public AbstractC0329 addTarget(Class cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    public AbstractC0329 removeTarget(View view) {
        this.mTargets.remove(view);
        return this;
    }

    public AbstractC0329 removeTarget(int i) {
        if (i != 0) {
            this.mTargetIds.remove(Integer.valueOf(i));
        }
        return this;
    }

    public AbstractC0329 removeTarget(String str) {
        ArrayList arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public AbstractC0329 removeTarget(Class cls) {
        ArrayList arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m2024(ArrayList arrayList, Object obj, boolean z) {
        if (obj == null) {
            return arrayList;
        }
        if (z) {
            return C15990.m38122(obj, arrayList);
        }
        return C15990.m38123(obj, arrayList);
    }

    public AbstractC0329 excludeTarget(View view, boolean z) {
        this.mTargetExcludes = m2022(this.mTargetExcludes, view, z);
        return this;
    }

    public AbstractC0329 excludeTarget(int i, boolean z) {
        this.mTargetIdExcludes = m2021(this.mTargetIdExcludes, i, z);
        return this;
    }

    public AbstractC0329 excludeTarget(String str, boolean z) {
        this.mTargetNameExcludes = m2024(this.mTargetNameExcludes, str, z);
        return this;
    }

    public AbstractC0329 excludeChildren(View view, boolean z) {
        this.mTargetChildExcludes = m2022(this.mTargetChildExcludes, view, z);
        return this;
    }

    public AbstractC0329 excludeChildren(int i, boolean z) {
        this.mTargetIdChildExcludes = m2021(this.mTargetIdChildExcludes, i, z);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m2021(ArrayList arrayList, int i, boolean z) {
        if (i <= 0) {
            return arrayList;
        }
        if (z) {
            return C15990.m38122(Integer.valueOf(i), arrayList);
        }
        return C15990.m38123(Integer.valueOf(i), arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m2022(ArrayList arrayList, View view, boolean z) {
        if (view == null) {
            return arrayList;
        }
        if (z) {
            return C15990.m38122(view, arrayList);
        }
        return C15990.m38123(view, arrayList);
    }

    public AbstractC0329 excludeTarget(Class cls, boolean z) {
        this.mTargetTypeExcludes = m2023(this.mTargetTypeExcludes, cls, z);
        return this;
    }

    public AbstractC0329 excludeChildren(Class cls, boolean z) {
        this.mTargetTypeChildExcludes = m2023(this.mTargetTypeChildExcludes, cls, z);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m2023(ArrayList arrayList, Class cls, boolean z) {
        if (cls == null) {
            return arrayList;
        }
        if (z) {
            return C15990.m38122(cls, arrayList);
        }
        return C15990.m38123(cls, arrayList);
    }

    public List getTargetIds() {
        return this.mTargetIds;
    }

    public List getTargets() {
        return this.mTargets;
    }

    public List getTargetNames() {
        return this.mTargetNames;
    }

    public List getTargetTypes() {
        return this.mTargetTypes;
    }

    public void captureValues(ViewGroup viewGroup, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C14307 c14307;
        clearValues(z);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.mTargetIds.get(i)).intValue());
                if (viewFindViewById != null) {
                    C22508 c22508 = new C22508(viewFindViewById);
                    if (z) {
                        captureStartValues(c22508);
                    } else {
                        captureEndValues(c22508);
                    }
                    c22508.f72816.add(this);
                    capturePropagationValues(c22508);
                    if (z) {
                        m2035(this.mStartValues, viewFindViewById, c22508);
                    } else {
                        m2035(this.mEndValues, viewFindViewById, c22508);
                    }
                }
            }
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                View view = (View) this.mTargets.get(i2);
                C22508 c22509 = new C22508(view);
                if (z) {
                    captureStartValues(c22509);
                } else {
                    captureEndValues(c22509);
                }
                c22509.f72816.add(this);
                capturePropagationValues(c22509);
                if (z) {
                    m2035(this.mStartValues, view, c22509);
                } else {
                    m2035(this.mEndValues, view, c22509);
                }
            }
        } else {
            m2029(viewGroup, z);
        }
        if (z || (c14307 = this.mNameOverrides) == null) {
            return;
        }
        int size = c14307.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add((View) this.mStartValues.f63000.remove((String) this.mNameOverrides.m24220(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.mStartValues.f63000.put((String) this.mNameOverrides.m24221(i4), view2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2035(C19524 c19524, View view, C22508 c22508) {
        C14307 c14307 = c19524.f63002;
        C14307 c14308 = c19524.f63000;
        SparseArray sparseArray = c19524.f62999;
        C18783 c18783 = c19524.f63001;
        c14307.put(view, c22508);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String strM51109 = C22666.m51109(view);
        if (strM51109 != null) {
            if (c14308.containsKey(strM51109)) {
                c14308.put(strM51109, null);
            } else {
                c14308.put(strM51109, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c18783.f61000) {
                    int i = c18783.f61001;
                    long[] jArr = c18783.f61002;
                    Object[] objArr = c18783.f60999;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != C9832.f31648) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    c18783.f61000 = false;
                    c18783.f61001 = i2;
                }
                if (C6850.m19065(itemIdAtPosition, c18783.f61002, c18783.f61001) >= 0) {
                    View view2 = (View) c18783.m43573(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        c18783.m43576(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                c18783.m43576(itemIdAtPosition, view);
            }
        }
    }

    public void clearValues(boolean z) {
        if (z) {
            this.mStartValues.f63002.clear();
            this.mStartValues.f62999.clear();
            this.mStartValues.f63001.m43574();
        } else {
            this.mEndValues.f63002.clear();
            this.mEndValues.f62999.clear();
            this.mEndValues.f63001.m43574();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2029(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (((Class) this.mTargetTypeExcludes.get(i)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C22508 c22508 = new C22508(view);
                    if (z) {
                        captureStartValues(c22508);
                    } else {
                        captureEndValues(c22508);
                    }
                    c22508.f72816.add(this);
                    capturePropagationValues(c22508);
                    if (z) {
                        m2035(this.mStartValues, view, c22508);
                    } else {
                        m2035(this.mEndValues, view, c22508);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (((Class) this.mTargetTypeChildExcludes.get(i2)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                m2029(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    public C22508 getTransitionValues(View view, boolean z) {
        C4608 c4608 = this.mParent;
        if (c4608 != null) {
            return c4608.getTransitionValues(view, z);
        }
        return (C22508) (z ? this.mStartValues : this.mEndValues).f63002.get(view);
    }

    public C22508 getMatchedTransitionValues(View view, boolean z) {
        C4608 c4608 = this.mParent;
        if (c4608 != null) {
            return c4608.getMatchedTransitionValues(view, z);
        }
        ArrayList arrayList = z ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C22508 c22508 = (C22508) arrayList.get(i);
            if (c22508 == null) {
                return null;
            }
            if (c22508.f72817 == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (C22508) (z ? this.mEndValuesList : this.mStartValuesList).get(i);
        }
        return null;
    }

    public void pause(View view) {
        if (this.mEnded) {
            return;
        }
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(InterfaceC18228.f59510, false);
        this.mPaused = true;
    }

    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                int size = this.mCurrentAnimators.size();
                Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
                this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.mAnimatorCache = animatorArr;
                notifyListeners(InterfaceC18228.f59513, false);
            }
            this.mPaused = false;
        }
    }

    public boolean hasAnimators() {
        return !this.mCurrentAnimators.isEmpty();
    }

    public void playTransition(ViewGroup viewGroup) {
        C17482 c17482;
        this.mStartValuesList = new ArrayList();
        this.mEndValuesList = new ArrayList();
        m2036(this.mStartValues, this.mEndValues);
        C14307 c14307M2027 = m2027();
        int size = c14307M2027.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) c14307M2027.m24220(i);
            if (animator != null && (c17482 = (C17482) c14307M2027.get(animator)) != null) {
                AbstractC0329 abstractC0329 = c17482.f56824;
                View view = c17482.f56826;
                if (view != null && windowId.equals(c17482.f56825)) {
                    C22508 c22508 = c17482.f56828;
                    C22508 transitionValues = getTransitionValues(view, true);
                    C22508 matchedTransitionValues = getMatchedTransitionValues(view, true);
                    if (transitionValues == null && matchedTransitionValues == null) {
                        matchedTransitionValues = (C22508) this.mEndValues.f63002.get(view);
                    }
                    if ((transitionValues != null || matchedTransitionValues != null) && abstractC0329.isTransitionRequired(c22508, matchedTransitionValues)) {
                        if (abstractC0329.getRootTransition().mSeekController != null) {
                            animator.cancel();
                            abstractC0329.mCurrentAnimators.remove(animator);
                            c14307M2027.remove(animator);
                            if (abstractC0329.mCurrentAnimators.size() == 0) {
                                abstractC0329.notifyListeners(InterfaceC18228.f59509, false);
                                if (!abstractC0329.mEnded) {
                                    abstractC0329.mEnded = true;
                                    abstractC0329.notifyListeners(InterfaceC18228.f59512, false);
                                }
                            }
                        } else if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            c14307M2027.remove(animator);
                        }
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        if (this.mSeekController == null) {
            runAnimators();
        } else if (Build.VERSION.SDK_INT >= 34) {
            prepareAnimatorsForSeeking();
            this.mSeekController.m46973();
            this.mSeekController.getClass();
        }
    }

    public boolean isTransitionRequired(C22508 c22508, C22508 c22509) {
        if (c22508 != null && c22509 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (m2038(c22508, c22509, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c22508.f72818.keySet().iterator();
                while (it.hasNext()) {
                    if (m2038(c22508, c22509, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m2038(C22508 c22508, C22508 c22509, String str) {
        Object obj = c22508.f72818.get(str);
        Object obj2 = c22509.f72818.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(animator.getStartDelay() + getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new C16736(this));
        animator.start();
    }

    public void start() {
        if (this.mNumInstances == 0) {
            notifyListeners(InterfaceC18228.f59511, false);
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public void end() {
        int i = this.mNumInstances - 1;
        this.mNumInstances = i;
        if (i == 0) {
            notifyListeners(InterfaceC18228.f59512, false);
            for (int i2 = 0; i2 < this.mStartValues.f63001.m43578(); i2++) {
                View view = (View) this.mStartValues.f63001.m43577(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < this.mEndValues.f63001.m43578(); i3++) {
                View view2 = (View) this.mEndValues.f63001.m43577(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.mEnded = true;
        }
    }

    public void forceToEnd(ViewGroup viewGroup) {
        C14307 c14307M2027 = m2027();
        int size = c14307M2027.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        C14307 c14307 = new C14307(c14307M2027);
        c14307M2027.clear();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C17482 c17482 = (C17482) c14307.m24221(size);
            if (c17482.f56826 != null && windowId.equals(c17482.f56825)) {
                ((Animator) c14307.m24220(size)).end();
            }
        }
    }

    public void cancel() {
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        while (true) {
            size--;
            if (size >= 0) {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.cancel();
            } else {
                this.mAnimatorCache = animatorArr;
                notifyListeners(InterfaceC18228.f59509, false);
                return;
            }
        }
    }

    public AbstractC0329 addListener(InterfaceC12261 interfaceC12261) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList();
        }
        this.mListeners.add(interfaceC12261);
        return this;
    }

    public AbstractC0329 removeListener(InterfaceC12261 interfaceC12261) {
        AbstractC0329 abstractC0329;
        ArrayList arrayList = this.mListeners;
        if (arrayList != null) {
            if (!arrayList.remove(interfaceC12261) && (abstractC0329 = this.mCloneParent) != null) {
                abstractC0329.removeListener(interfaceC12261);
            }
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
        return this;
    }

    public void setPathMotion(AbstractC19720 abstractC19720) {
        if (abstractC19720 == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = abstractC19720;
        }
    }

    public AbstractC19720 getPathMotion() {
        return this.mPathMotion;
    }

    public void setEpicenterCallback(AbstractC23450 abstractC23450) {
        this.mEpicenterCallback = abstractC23450;
    }

    public AbstractC23450 getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public Rect getEpicenter() {
        AbstractC23450 abstractC23450 = this.mEpicenterCallback;
        if (abstractC23450 == null) {
            return null;
        }
        return abstractC23450.mo18986();
    }

    public void setCanRemoveViews(boolean z) {
        this.mCanRemoveViews = z;
    }

    public String toString() {
        return toString("");
    }

    @Override // 
    public AbstractC0329 clone() {
        try {
            AbstractC0329 abstractC0329 = (AbstractC0329) super.clone();
            abstractC0329.mAnimators = new ArrayList();
            abstractC0329.mStartValues = new C19524();
            abstractC0329.mEndValues = new C19524();
            abstractC0329.mStartValuesList = null;
            abstractC0329.mEndValuesList = null;
            abstractC0329.mSeekController = null;
            abstractC0329.mCloneParent = this;
            abstractC0329.mListeners = null;
            return abstractC0329;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return this.mName;
    }

    public void notifyListeners(InterfaceC18228 interfaceC18228, boolean z) {
        m2030(this, interfaceC18228, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2030(AbstractC0329 abstractC0329, InterfaceC18228 interfaceC18228, boolean z) {
        AbstractC0329 abstractC03210 = this.mCloneParent;
        if (abstractC03210 != null) {
            abstractC03210.m2030(abstractC0329, interfaceC18228, z);
        }
        ArrayList arrayList = this.mListeners;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.mListeners.size();
        InterfaceC12261[] interfaceC12261Arr = this.mListenersCache;
        if (interfaceC12261Arr == null) {
            interfaceC12261Arr = new InterfaceC12261[size];
        }
        this.mListenersCache = null;
        InterfaceC12261[] interfaceC12261Arr2 = (InterfaceC12261[]) this.mListeners.toArray(interfaceC12261Arr);
        for (int i = 0; i < size; i++) {
            interfaceC18228.mo13056(interfaceC12261Arr2[i], abstractC0329, z);
            interfaceC12261Arr2[i] = null;
        }
        this.mListenersCache = interfaceC12261Arr2;
    }

    public final long getTotalDurationMillis() {
        return this.mTotalDuration;
    }

    public void setCurrentPlayTimeMillis(long j, long j2) {
        long totalDurationMillis = getTotalDurationMillis();
        int i = 0;
        boolean z = j < j2;
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if ((i2 < 0 && j >= 0) || (j2 > totalDurationMillis && j <= totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(InterfaceC18228.f59511, z);
        }
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int size = this.mCurrentAnimators.size(); i < size; size = size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            C3312.m10927(animator, Math.min(Math.max(0L, j), C3312.m10926(animator)));
            i++;
            i2 = i2;
        }
        int i3 = i2;
        this.mAnimatorCache = animatorArr;
        if ((j <= totalDurationMillis || j2 > totalDurationMillis) && (j >= 0 || i3 < 0)) {
            return;
        }
        if (j > totalDurationMillis) {
            this.mEnded = true;
        }
        notifyListeners(InterfaceC18228.f59512, z);
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.mDuration != -1) {
            sb.append("dur(");
            sb.append(this.mDuration);
            sb.append(") ");
        }
        if (this.mStartDelay != -1) {
            sb.append("dly(");
            sb.append(this.mStartDelay);
            sb.append(") ");
        }
        if (this.mInterpolator != null) {
            sb.append("interp(");
            sb.append(this.mInterpolator);
            sb.append(") ");
        }
        if (this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            sb.append("tgts(");
            if (this.mTargetIds.size() > 0) {
                for (int i = 0; i < this.mTargetIds.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.mTargetIds.get(i));
                }
            }
            if (this.mTargets.size() > 0) {
                for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.mTargets.get(i2));
                }
            }
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        }
        return sb.toString();
    }
}
