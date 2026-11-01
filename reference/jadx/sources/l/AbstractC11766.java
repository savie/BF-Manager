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

/* JADX INFO: renamed from: l.ۨܳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5Y2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11766 implements Cloneable {
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
    public AbstractC17680 mEpicenterCallback;
    public InterfaceC24031[] mListenersCache;
    public C21445 mNameOverrides;
    public AbstractC13177 mPropagation;
    public C11331 mSeekController;
    public long mSeekOffsetInParent;
    public ArrayList mStartValuesList;
    public long mTotalDuration;
    public static final Animator[] EMPTY_ANIMATOR_ARRAY = new Animator[0];
    public static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    public static final AbstractC19798 STRAIGHT_PATH_MOTION = new C16270();
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
    public C19527 mStartValues = new C19527();
    public C19527 mEndValues = new C19527();
    public C21643 mParent = null;
    public int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    public boolean mCanRemoveViews = false;
    public ArrayList mCurrentAnimators = new ArrayList();
    public Animator[] mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
    public int mNumInstances = 0;
    public boolean mPaused = false;
    public boolean mEnded = false;
    public AbstractC11766 mCloneParent = null;
    public ArrayList mListeners = null;
    public ArrayList mAnimators = new ArrayList();
    public AbstractC19798 mPathMotion = STRAIGHT_PATH_MOTION;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29381(int i) {
        return i >= 1 && i <= 4;
    }

    public abstract void captureEndValues(C8238 c8238);

    public void capturePropagationValues(C8238 c8238) {
    }

    public abstract void captureStartValues(C8238 c8238);

    public Animator createAnimator(ViewGroup viewGroup, C8238 c8238, C8238 c8239) {
        return null;
    }

    public AbstractC13177 getPropagation() {
        return null;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public boolean isSeekingSupported() {
        return false;
    }

    public void setPropagation(AbstractC13177 abstractC13177) {
    }

    public AbstractC11766() {
    }

    public AbstractC11766(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21208.f69012);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jM30833 = C12398.m30833(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jM30833 >= 0) {
            setDuration(jM30833);
        }
        long j = xmlResourceParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "startDelay") != null ? typedArrayObtainStyledAttributes.getInt(2, -1) : -1;
        if (j > 0) {
            setStartDelay(j);
        }
        int resourceId = xmlResourceParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "interpolator") != null ? typedArrayObtainStyledAttributes.getResourceId(0, 0) : 0;
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        String strM30835 = C12398.m30835(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strM30835 != null) {
            setMatchOrder(m29384(strM30835));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m29384(String str) {
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
                    throw new InflateException(C16523.m38890("Unknown match type in matchOrder: '", strTrim, "'"));
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

    public final AbstractC11766 getRootTransition() {
        C21643 c21643 = this.mParent;
        return c21643 != null ? c21643.getRootTransition() : this;
    }

    public AbstractC11766 setDuration(long j) {
        this.mDuration = j;
        return this;
    }

    public long getDuration() {
        return this.mDuration;
    }

    public AbstractC11766 setStartDelay(long j) {
        this.mStartDelay = j;
        return this;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    public AbstractC11766 setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public InterfaceC4003 createSeekController() {
        C11331 c11331 = new C11331(this);
        this.mSeekController = c11331;
        addListener(c11331);
        return this.mSeekController;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (!m29381(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (m29383(iArr, i)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29383(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m29385(C21445 c21445, C21445 c21446) {
        C8238 c8238;
        int size = c21445.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            View view = (View) c21445.m30510(size);
            if (view != null && isValidTarget(view) && (c8238 = (C8238) c21446.remove(view)) != null && isValidTarget(c8238.f28685)) {
                this.mStartValuesList.add((C8238) c21445.m30509(size));
                this.mEndValuesList.add(c8238);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29379(C21445 c21445, C21445 c21446, C8746 c8746, C8746 c8747) {
        View view;
        int iM22707 = c8746.m22707();
        for (int i = 0; i < iM22707; i++) {
            View view2 = (View) c8746.m22701(i);
            if (view2 != null && isValidTarget(view2) && (view = (View) c8747.m22709(c8746.m22703(i), null)) != null && isValidTarget(view)) {
                C8238 c8238 = (C8238) c21445.getOrDefault(view2, null);
                C8238 c8239 = (C8238) c21446.getOrDefault(view, null);
                if (c8238 != null && c8239 != null) {
                    this.mStartValuesList.add(c8238);
                    this.mEndValuesList.add(c8239);
                    c21445.remove(view2);
                    c21446.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29378(C21445 c21445, C21445 c21446, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) sparseArray.valueAt(i);
            if (view2 != null && isValidTarget(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i))) != null && isValidTarget(view)) {
                C8238 c8238 = (C8238) c21445.getOrDefault(view2, null);
                C8238 c8239 = (C8238) c21446.getOrDefault(view, null);
                if (c8238 != null && c8239 != null) {
                    this.mStartValuesList.add(c8238);
                    this.mEndValuesList.add(c8239);
                    c21445.remove(view2);
                    c21446.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29380(C21445 c21445, C21445 c21446, C21445 c21447, C21445 c21448) {
        View view;
        int size = c21447.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) c21447.m30513(i);
            if (view2 != null && isValidTarget(view2) && (view = (View) c21448.getOrDefault(c21447.m30510(i), null)) != null && isValidTarget(view)) {
                C8238 c8238 = (C8238) c21445.getOrDefault(view2, null);
                C8238 c8239 = (C8238) c21446.getOrDefault(view, null);
                if (c8238 != null && c8239 != null) {
                    this.mStartValuesList.add(c8238);
                    this.mEndValuesList.add(c8239);
                    c21445.remove(view2);
                    c21446.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29377(C21445 c21445, C21445 c21446) {
        for (int i = 0; i < c21445.size(); i++) {
            C8238 c8238 = (C8238) c21445.m30513(i);
            if (isValidTarget(c8238.f28685)) {
                this.mStartValuesList.add(c8238);
                this.mEndValuesList.add(null);
            }
        }
        for (int i2 = 0; i2 < c21446.size(); i2++) {
            C8238 c8239 = (C8238) c21446.m30513(i2);
            if (isValidTarget(c8239.f28685)) {
                this.mEndValuesList.add(c8239);
                this.mStartValuesList.add(null);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29376(C19527 c19527, C19527 c19528) {
        C21445 c21445 = new C21445(c19527.f62786);
        C21445 c21446 = new C21445(c19528.f62786);
        int i = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m29385(c21445, c21446);
                } else if (i2 == 2) {
                    m29380(c21445, c21446, c19527.f62788, c19528.f62788);
                } else if (i2 == 3) {
                    m29378(c21445, c21446, c19527.f62787, c19528.f62787);
                } else if (i2 == 4) {
                    m29379(c21445, c21446, c19527.f62789, c19528.f62789);
                }
                i++;
            } else {
                m29377(c21445, c21446);
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:72:0x0111 A[SYNTHETIC] */
    public void createAnimators(ViewGroup viewGroup, C19527 c19527, C19527 c19528, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        C8238 c8238;
        Object obj;
        C21445 c21445M29371 = m29371();
        SparseIntArray sparseIntArray = new SparseIntArray();
        boolean z = getRootTransition().mSeekController != null;
        int i = 0;
        for (int size = arrayList.size(); i < size; size = size) {
            C8238 c8239 = (C8238) arrayList.get(i);
            C8238 c82310 = (C8238) arrayList2.get(i);
            if (c8239 != null && !c8239.f28684.contains(this)) {
                c8239 = null;
            }
            if (c82310 != null && !c82310.f28684.contains(this)) {
                c82310 = null;
            }
            if ((c8239 != null || c82310 != null) && (c8239 == null || c82310 == null || isTransitionRequired(c8239, c82310))) {
                Animator animatorCreateAnimator = createAnimator(viewGroup, c8239, c82310);
                if (animatorCreateAnimator != null) {
                    if (c82310 != null) {
                        view = c82310.f28685;
                        String[] transitionProperties = getTransitionProperties();
                        if (transitionProperties != null && transitionProperties.length > 0) {
                            c8238 = new C8238(view);
                            C8238 c82311 = (C8238) c19528.f62786.getOrDefault(view, null);
                            if (c82311 != null) {
                                int i2 = 0;
                                while (i2 < transitionProperties.length) {
                                    String str = transitionProperties[i2];
                                    c8238.f28686.put(str, c82311.f28686.get(str));
                                    i2++;
                                    c82311 = c82311;
                                }
                            }
                            int size2 = c21445M29371.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                C16975 c16975 = (C16975) c21445M29371.getOrDefault((Animator) c21445M29371.m30510(i3), null);
                                if (c16975.f54309 != null && c16975.f54311 == view && c16975.f54313.equals(getName()) && c16975.f54309.equals(c8238)) {
                                    animatorCreateAnimator = null;
                                    break;
                                }
                            }
                        }
                        if (animatorCreateAnimator != null) {
                            String name = getName();
                            WindowId windowId = viewGroup.getWindowId();
                            C16975 c16976 = new C16975();
                            c16976.f54311 = view;
                            c16976.f54313 = name;
                            c16976.f54309 = c8238;
                            c16976.f54314 = windowId;
                            c16976.f54312 = this;
                            c16976.f54310 = animatorCreateAnimator;
                            if (z) {
                                obj = animatorCreateAnimator;
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.play(animatorCreateAnimator);
                                obj = animatorSet;
                            }
                            obj = animatorCreateAnimator;
                            c21445M29371.put(obj, c16976);
                            this.mAnimators.add(obj);
                        }
                    } else {
                        view = c8239.f28685;
                    }
                    c8238 = null;
                    if (animatorCreateAnimator != null) {
                        String name2 = getName();
                        WindowId windowId2 = viewGroup.getWindowId();
                        C16975 c16977 = new C16975();
                        c16977.f54311 = view;
                        c16977.f54313 = name2;
                        c16977.f54309 = c8238;
                        c16977.f54314 = windowId2;
                        c16977.f54312 = this;
                        c16977.f54310 = animatorCreateAnimator;
                        if (z) {
                            obj = animatorCreateAnimator;
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.play(animatorCreateAnimator);
                            obj = animatorSet2;
                        }
                        obj = animatorCreateAnimator;
                        c21445M29371.put(obj, c16977);
                        this.mAnimators.add(obj);
                    }
                }
                i++;
            }
            size = size;
            i++;
        }
        if (sparseIntArray.size() != 0) {
            for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
                C16975 c16978 = (C16975) c21445M29371.getOrDefault((Animator) this.mAnimators.get(sparseIntArray.keyAt(i4)), null);
                c16978.f54310.setStartDelay(c16978.f54310.getStartDelay() + (((long) sparseIntArray.valueAt(i4)) - C17492.FOREVER_NS));
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
        if (this.mTargetNameExcludes != null && C5031.m14001(view) != null && this.mTargetNameExcludes.contains(C5031.m14001(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(C5031.m14001(view))) {
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
    public static C21445 m29371() {
        C21445 c21445 = (C21445) sRunningAnimators.get();
        if (c21445 != null) {
            return c21445;
        }
        C21445 c21446 = new C21445();
        sRunningAnimators.set(c21446);
        return c21446;
    }

    public void runAnimators() {
        start();
        C21445 c21445M29371 = m29371();
        for (Animator animator : this.mAnimators) {
            if (c21445M29371.containsKey(animator)) {
                start();
                m29372(animator, c21445M29371);
            }
        }
        this.mAnimators.clear();
        end();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29372(Animator animator, C21445 c21445) {
        if (animator != null) {
            animator.addListener(new C20503(this, c21445));
            animate(animator);
        }
    }

    public void prepareAnimatorsForSeeking() {
        C21445 c21445M29371 = m29371();
        this.mTotalDuration = 0L;
        for (int i = 0; i < this.mAnimators.size(); i++) {
            Animator animator = (Animator) this.mAnimators.get(i);
            C16975 c16975 = (C16975) c21445M29371.getOrDefault(animator, null);
            if (animator != null && c16975 != null) {
                Animator animator2 = c16975.f54310;
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
                this.mTotalDuration = Math.max(this.mTotalDuration, C6391.m17537(animator));
            }
        }
        this.mAnimators.clear();
    }

    public AbstractC11766 addTarget(View view) {
        this.mTargets.add(view);
        return this;
    }

    public AbstractC11766 addTarget(int i) {
        if (i != 0) {
            this.mTargetIds.add(Integer.valueOf(i));
        }
        return this;
    }

    public AbstractC11766 addTarget(String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList();
        }
        this.mTargetNames.add(str);
        return this;
    }

    public AbstractC11766 addTarget(Class cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    public AbstractC11766 removeTarget(View view) {
        this.mTargets.remove(view);
        return this;
    }

    public AbstractC11766 removeTarget(int i) {
        if (i != 0) {
            this.mTargetIds.remove(Integer.valueOf(i));
        }
        return this;
    }

    public AbstractC11766 removeTarget(String str) {
        ArrayList arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public AbstractC11766 removeTarget(Class cls) {
        ArrayList arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m29368(ArrayList arrayList, Object obj, boolean z) {
        if (obj == null) {
            return arrayList;
        }
        if (z) {
            return C12742.m31675(obj, arrayList);
        }
        return C12742.m31676(obj, arrayList);
    }

    public AbstractC11766 excludeTarget(View view, boolean z) {
        this.mTargetExcludes = m29366(this.mTargetExcludes, view, z);
        return this;
    }

    public AbstractC11766 excludeTarget(int i, boolean z) {
        this.mTargetIdExcludes = m29365(this.mTargetIdExcludes, i, z);
        return this;
    }

    public AbstractC11766 excludeTarget(String str, boolean z) {
        this.mTargetNameExcludes = m29368(this.mTargetNameExcludes, str, z);
        return this;
    }

    public AbstractC11766 excludeChildren(View view, boolean z) {
        this.mTargetChildExcludes = m29366(this.mTargetChildExcludes, view, z);
        return this;
    }

    public AbstractC11766 excludeChildren(int i, boolean z) {
        this.mTargetIdChildExcludes = m29365(this.mTargetIdChildExcludes, i, z);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m29365(ArrayList arrayList, int i, boolean z) {
        if (i <= 0) {
            return arrayList;
        }
        if (z) {
            return C12742.m31675(Integer.valueOf(i), arrayList);
        }
        return C12742.m31676(Integer.valueOf(i), arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m29366(ArrayList arrayList, View view, boolean z) {
        if (view == null) {
            return arrayList;
        }
        if (z) {
            return C12742.m31675(view, arrayList);
        }
        return C12742.m31676(view, arrayList);
    }

    public AbstractC11766 excludeTarget(Class cls, boolean z) {
        this.mTargetTypeExcludes = m29367(this.mTargetTypeExcludes, cls, z);
        return this;
    }

    public AbstractC11766 excludeChildren(Class cls, boolean z) {
        this.mTargetTypeChildExcludes = m29367(this.mTargetTypeChildExcludes, cls, z);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m29367(ArrayList arrayList, Class cls, boolean z) {
        if (cls == null) {
            return arrayList;
        }
        if (z) {
            return C12742.m31675(cls, arrayList);
        }
        return C12742.m31676(cls, arrayList);
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
        C21445 c21445;
        clearValues(z);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.mTargetIds.get(i)).intValue());
                if (viewFindViewById != null) {
                    C8238 c8238 = new C8238(viewFindViewById);
                    if (z) {
                        captureStartValues(c8238);
                    } else {
                        captureEndValues(c8238);
                    }
                    c8238.f28684.add(this);
                    capturePropagationValues(c8238);
                    if (z) {
                        m29375(this.mStartValues, viewFindViewById, c8238);
                    } else {
                        m29375(this.mEndValues, viewFindViewById, c8238);
                    }
                }
            }
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                View view = (View) this.mTargets.get(i2);
                C8238 c8239 = new C8238(view);
                if (z) {
                    captureStartValues(c8239);
                } else {
                    captureEndValues(c8239);
                }
                c8239.f28684.add(this);
                capturePropagationValues(c8239);
                if (z) {
                    m29375(this.mStartValues, view, c8239);
                } else {
                    m29375(this.mEndValues, view, c8239);
                }
            }
        } else {
            m29373(viewGroup, z);
        }
        if (z || (c21445 = this.mNameOverrides) == null) {
            return;
        }
        int size = c21445.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add((View) this.mStartValues.f62788.remove((String) this.mNameOverrides.m30510(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.mStartValues.f62788.put((String) this.mNameOverrides.m30513(i4), view2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29375(C19527 c19527, View view, C8238 c8238) {
        C21445 c21445 = c19527.f62786;
        C21445 c21446 = c19527.f62788;
        SparseArray sparseArray = c19527.f62787;
        C8746 c8746 = c19527.f62789;
        c21445.put(view, c8238);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String strM14001 = C5031.m14001(view);
        if (strM14001 != null) {
            if (c21446.containsKey(strM14001)) {
                c21446.put(strM14001, null);
            } else {
                c21446.put(strM14001, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c8746.m22702(itemIdAtPosition) >= 0) {
                    View view2 = (View) c8746.m22709(itemIdAtPosition, null);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        c8746.m22706(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                c8746.m22706(itemIdAtPosition, view);
            }
        }
    }

    public void clearValues(boolean z) {
        if (z) {
            this.mStartValues.f62786.clear();
            this.mStartValues.f62787.clear();
            this.mStartValues.f62789.m22704();
        } else {
            this.mEndValues.f62786.clear();
            this.mEndValues.f62787.clear();
            this.mEndValues.f62789.m22704();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29373(View view, boolean z) {
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
                    C8238 c8238 = new C8238(view);
                    if (z) {
                        captureStartValues(c8238);
                    } else {
                        captureEndValues(c8238);
                    }
                    c8238.f28684.add(this);
                    capturePropagationValues(c8238);
                    if (z) {
                        m29375(this.mStartValues, view, c8238);
                    } else {
                        m29375(this.mEndValues, view, c8238);
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
                                m29373(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    public C8238 getTransitionValues(View view, boolean z) {
        C21643 c21643 = this.mParent;
        if (c21643 != null) {
            return c21643.getTransitionValues(view, z);
        }
        return (C8238) (z ? this.mStartValues : this.mEndValues).f62786.getOrDefault(view, null);
    }

    public C8238 getMatchedTransitionValues(View view, boolean z) {
        C21643 c21643 = this.mParent;
        if (c21643 != null) {
            return c21643.getMatchedTransitionValues(view, z);
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
            C8238 c8238 = (C8238) arrayList.get(i);
            if (c8238 == null) {
                return null;
            }
            if (c8238.f28685 == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (C8238) (z ? this.mEndValuesList : this.mStartValuesList).get(i);
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
        notifyListeners(InterfaceC13883.f45756, false);
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
                notifyListeners(InterfaceC13883.f45753, false);
            }
            this.mPaused = false;
        }
    }

    public boolean hasAnimators() {
        return !this.mCurrentAnimators.isEmpty();
    }

    public void playTransition(ViewGroup viewGroup) {
        C16975 c16975;
        this.mStartValuesList = new ArrayList();
        this.mEndValuesList = new ArrayList();
        m29376(this.mStartValues, this.mEndValues);
        C21445 c21445M29371 = m29371();
        int size = c21445M29371.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) c21445M29371.m30510(i);
            if (animator != null && (c16975 = (C16975) c21445M29371.getOrDefault(animator, null)) != null) {
                AbstractC11766 abstractC11766 = c16975.f54312;
                View view = c16975.f54311;
                if (view != null && windowId.equals(c16975.f54314)) {
                    C8238 c8238 = c16975.f54309;
                    C8238 transitionValues = getTransitionValues(view, true);
                    C8238 matchedTransitionValues = getMatchedTransitionValues(view, true);
                    if (transitionValues == null && matchedTransitionValues == null) {
                        matchedTransitionValues = (C8238) this.mEndValues.f62786.getOrDefault(view, null);
                    }
                    if ((transitionValues != null || matchedTransitionValues != null) && abstractC11766.isTransitionRequired(c8238, matchedTransitionValues)) {
                        if (abstractC11766.getRootTransition().mSeekController != null) {
                            animator.cancel();
                            abstractC11766.mCurrentAnimators.remove(animator);
                            c21445M29371.remove(animator);
                            if (abstractC11766.mCurrentAnimators.size() == 0) {
                                abstractC11766.notifyListeners(InterfaceC13883.f45754, false);
                                if (!abstractC11766.mEnded) {
                                    abstractC11766.mEnded = true;
                                    abstractC11766.notifyListeners(InterfaceC13883.f45757, false);
                                }
                            }
                        } else if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            c21445M29371.remove(animator);
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
            this.mSeekController.m28392();
            this.mSeekController.getClass();
        }
    }

    public boolean isTransitionRequired(C8238 c8238, C8238 c8239) {
        if (c8238 != null && c8239 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (m29382(c8238, c8239, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c8238.f28686.keySet().iterator();
                while (it.hasNext()) {
                    if (m29382(c8238, c8239, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29382(C8238 c8238, C8238 c8239, String str) {
        Object obj = c8238.f28686.get(str);
        Object obj2 = c8239.f28686.get(str);
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
        animator.addListener(new C0746(this));
        animator.start();
    }

    public void start() {
        if (this.mNumInstances == 0) {
            notifyListeners(InterfaceC13883.f45755, false);
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public void end() {
        int i = this.mNumInstances - 1;
        this.mNumInstances = i;
        if (i == 0) {
            notifyListeners(InterfaceC13883.f45757, false);
            for (int i2 = 0; i2 < this.mStartValues.f62789.m22707(); i2++) {
                View view = (View) this.mStartValues.f62789.m22701(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < this.mEndValues.f62789.m22707(); i3++) {
                View view2 = (View) this.mEndValues.f62789.m22701(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.mEnded = true;
        }
    }

    public void forceToEnd(ViewGroup viewGroup) {
        C21445 c21445M29371 = m29371();
        int size = c21445M29371.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        C21445 c21445 = new C21445(c21445M29371);
        c21445M29371.clear();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C16975 c16975 = (C16975) c21445.m30513(size);
            if (c16975.f54311 != null && windowId.equals(c16975.f54314)) {
                ((Animator) c21445.m30510(size)).end();
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
                notifyListeners(InterfaceC13883.f45754, false);
                return;
            }
        }
    }

    public AbstractC11766 addListener(InterfaceC24031 interfaceC24031) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList();
        }
        this.mListeners.add(interfaceC24031);
        return this;
    }

    public AbstractC11766 removeListener(InterfaceC24031 interfaceC24031) {
        AbstractC11766 abstractC11766;
        ArrayList arrayList = this.mListeners;
        if (arrayList != null) {
            if (!arrayList.remove(interfaceC24031) && (abstractC11766 = this.mCloneParent) != null) {
                abstractC11766.removeListener(interfaceC24031);
            }
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
        return this;
    }

    public void setPathMotion(AbstractC19798 abstractC19798) {
        if (abstractC19798 == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = abstractC19798;
        }
    }

    public AbstractC19798 getPathMotion() {
        return this.mPathMotion;
    }

    public void setEpicenterCallback(AbstractC17680 abstractC17680) {
        this.mEpicenterCallback = abstractC17680;
    }

    public AbstractC17680 getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public Rect getEpicenter() {
        AbstractC17680 abstractC17680 = this.mEpicenterCallback;
        if (abstractC17680 == null) {
            return null;
        }
        return abstractC17680.mo41158();
    }

    public void setCanRemoveViews(boolean z) {
        this.mCanRemoveViews = z;
    }

    public String toString() {
        return toString("");
    }

    @Override // 
    public AbstractC11766 clone() {
        try {
            AbstractC11766 abstractC11766 = (AbstractC11766) super.clone();
            abstractC11766.mAnimators = new ArrayList();
            abstractC11766.mStartValues = new C19527();
            abstractC11766.mEndValues = new C19527();
            abstractC11766.mStartValuesList = null;
            abstractC11766.mEndValuesList = null;
            abstractC11766.mSeekController = null;
            abstractC11766.mCloneParent = this;
            abstractC11766.mListeners = null;
            return abstractC11766;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return this.mName;
    }

    public void notifyListeners(InterfaceC13883 interfaceC13883, boolean z) {
        m29374(this, interfaceC13883, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29374(AbstractC11766 abstractC11766, InterfaceC13883 interfaceC13883, boolean z) {
        AbstractC11766 abstractC11767 = this.mCloneParent;
        if (abstractC11767 != null) {
            abstractC11767.m29374(abstractC11766, interfaceC13883, z);
        }
        ArrayList arrayList = this.mListeners;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.mListeners.size();
        InterfaceC24031[] interfaceC24031Arr = this.mListenersCache;
        if (interfaceC24031Arr == null) {
            interfaceC24031Arr = new InterfaceC24031[size];
        }
        this.mListenersCache = null;
        InterfaceC24031[] interfaceC24031Arr2 = (InterfaceC24031[]) this.mListeners.toArray(interfaceC24031Arr);
        for (int i = 0; i < size; i++) {
            interfaceC13883.mo6722(interfaceC24031Arr2[i], abstractC11766, z);
            interfaceC24031Arr2[i] = null;
        }
        this.mListenersCache = interfaceC24031Arr2;
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
            notifyListeners(InterfaceC13883.f45755, z);
        }
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int size = this.mCurrentAnimators.size(); i < size; size = size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            C6391.m17538(animator, Math.min(Math.max(0L, j), C6391.m17537(animator)));
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
        notifyListeners(InterfaceC13883.f45757, z);
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
