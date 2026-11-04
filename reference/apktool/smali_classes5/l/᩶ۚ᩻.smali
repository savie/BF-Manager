.class public final Ll/᩶ۚ᩻;
.super Ljava/lang/Object;
.source "F6QC"


# static fields
.field public static final ۧ:Ljava/util/Set;

.field public static final ᩻:Ljava/util/Set;


# instance fields
.field public final ֫:Ljava/lang/CharSequence;

.field public final ۙ:Z

.field public final ۚ:Z

.field public final ۤ:Ljava/lang/String;

.field public final ۫:Ll/֡ۚ᩻;

.field public final ܳ:Ljava/util/ArrayList;

.field public final ᩴ:Ll/۫᩸᩻;

.field public final ᩷:Z

.field public final ᩸:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 48

    const-string v46, "base"

    const-string v47, "template"

    const-string v0, "html"

    const-string v1, "head"

    const-string v2, "body"

    const-string v3, "address"

    const-string v4, "article"

    const-string v5, "aside"

    const-string v6, "blockquote"

    const-string v7, "div"

    const-string v8, "dl"

    const-string v9, "dt"

    const-string v10, "dd"

    const-string v11, "fieldset"

    const-string v12, "figcaption"

    const-string v13, "figure"

    const-string v14, "footer"

    const-string v15, "form"

    const-string v16, "h1"

    const-string v17, "h2"

    const-string v18, "h3"

    const-string v19, "h4"

    const-string v20, "h5"

    const-string v21, "h6"

    const-string v22, "header"

    const-string v23, "hgroup"

    const-string v24, "hr"

    const-string v25, "li"

    const-string v26, "main"

    const-string v27, "menu"

    const-string v28, "nav"

    const-string v29, "ol"

    const-string v30, "p"

    const-string v31, "pre"

    const-string v32, "section"

    const-string v33, "table"

    const-string v34, "thead"

    const-string v35, "tbody"

    const-string v36, "tfoot"

    const-string v37, "tr"

    const-string v38, "td"

    const-string v39, "th"

    const-string v40, "ul"

    const-string v41, "script"

    const-string v42, "style"

    const-string v43, "title"

    const-string v44, "meta"

    const-string v45, "link"

    .line 29
    filled-new-array/range {v0 .. v47}, [Ljava/lang/String;

    move-result-object v0

    .line 0
    new-instance v1, Ljava/util/HashSet;

    const/16 v2, 0x30

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const-string v5, "duplicate element: "

    if-ge v4, v2, :cond_1

    aget-object v6, v0, v4

    invoke-static {v6}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v1}, Ll/ۙۚۗ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 29
    sput-object v0, Ll/᩶ۚ᩻;->ۧ:Ljava/util/Set;

    const/4 v0, 0x7

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "script"

    aput-object v2, v1, v3

    const-string v2, "style"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const-string v2, "title"

    const/4 v4, 0x2

    aput-object v2, v1, v4

    const-string v2, "meta"

    const/4 v4, 0x3

    aput-object v2, v1, v4

    const-string v2, "link"

    const/4 v4, 0x4

    aput-object v2, v1, v4

    const-string v2, "base"

    const/4 v4, 0x5

    aput-object v2, v1, v4

    const-string v2, "template"

    const/4 v4, 0x6

    aput-object v2, v1, v4

    .line 0
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(I)V

    :goto_1
    if-ge v3, v0, :cond_3

    aget-object v4, v1, v3

    invoke-static {v4}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v5, v4}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-static {v2}, Ll/ۙۚۗ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 34
    sput-object v0, Ll/᩶ۚ᩻;->᩻:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Ll/۫᩸᩻;Ll/ܳۚ᩻;Z)V
    .locals 3

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩶ۚ᩻;->ܳ:Ljava/util/ArrayList;

    .line 47
    iput-object p1, p0, Ll/᩶ۚ᩻;->֫:Ljava/lang/CharSequence;

    .line 48
    new-instance v0, Ll/֡ۚ᩻;

    invoke-direct {v0, p1}, Ll/֡ۚ᩻;-><init>(Ljava/lang/CharSequence;)V

    iput-object v0, p0, Ll/᩶ۚ᩻;->۫:Ll/֡ۚ᩻;

    .line 49
    iput-object p2, p0, Ll/᩶ۚ᩻;->ᩴ:Ll/۫᩸᩻;

    .line 50
    iput-boolean p4, p0, Ll/᩶ۚ᩻;->᩷:Z

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p4, :cond_0

    .line 51
    invoke-virtual {p3}, Ll/ܳۚ᩻;->ۙ()Ll/ᩴۚ᩻;

    move-result-object p4

    sget-object v2, Ll/ᩴۚ᩻;->ܿ:Ll/ᩴۚ᩻;

    if-ne p4, v2, :cond_0

    const/4 p4, 0x1

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    iput-boolean p4, p0, Ll/᩶ۚ᩻;->ۚ:Z

    .line 52
    invoke-virtual {p3}, Ll/ܳۚ᩻;->ۙ()Ll/ᩴۚ᩻;

    move-result-object p3

    sget-object p4, Ll/ᩴۚ᩻;->ܿ:Ll/ᩴۚ᩻;

    if-ne p3, p4, :cond_1

    const/4 p3, 0x1

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    :goto_1
    iput-boolean p3, p0, Ll/᩶ۚ᩻;->ۙ:Z

    .line 53
    invoke-static {p1}, Ll/ᩳۚ᩻;->ۙ(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩶ۚ᩻;->᩸:Ljava/lang/String;

    .line 54
    invoke-virtual {p2}, Ll/۫᩸᩻;->᩷()Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "\t"

    goto :goto_3

    :cond_2
    invoke-virtual {p2}, Ll/۫᩸᩻;->ۙ()I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    if-ltz p1, :cond_7

    if-eqz p1, :cond_6

    const-string p2, " "

    if-ne p1, v1, :cond_3

    move-object p1, p2

    goto :goto_3

    :cond_3
    const p3, 0x7fffffff

    .line 0
    div-int/2addr p3, p1

    if-gt v1, p3, :cond_5

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    :goto_2
    if-ge v0, p1, :cond_4

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_5
    new-instance p2, Ljava/lang/OutOfMemoryError;

    const-string p3, "Repeating 1 bytes String "

    const-string p4, " times will produce a String exceeding maximum size."

    invoke-static {p1, p3, p4}, Ll/ܰ۟ۙ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    const-string p1, ""

    .line 54
    :goto_3
    iput-object p1, p0, Ll/᩶ۚ᩻;->ۤ:Ljava/lang/String;

    return-void

    .line 0
    :cond_7
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string p3, "count is negative: "

    invoke-static {p1, p3}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private ۙ()V
    .locals 5

    .line 212
    iget-object v0, p0, Ll/᩶ۚ᩻;->ᩴ:Ll/۫᩸᩻;

    invoke-virtual {v0}, Ll/۫᩸᩻;->ۤ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 213
    :cond_0
    iget-object v0, p0, Ll/᩶ۚ᩻;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰۚ᩻;

    .line 214
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 215
    iget-boolean v2, v1, Ll/ܰۚ᩻;->ۤ:Z

    if-nez v2, :cond_1

    iget-boolean v2, v1, Ll/ܰۚ᩻;->ۚ:Z

    if-nez v2, :cond_1

    iget-boolean v2, v1, Ll/ܰۚ᩻;->᩵:Z

    if-nez v2, :cond_1

    iget-boolean v2, v1, Ll/ܰۚ᩻;->᩶:Z

    if-eqz v2, :cond_1

    iget-object v2, v1, Ll/ܰۚ᩻;->۫:Ll/ܰۚ᩻;

    if-nez v2, :cond_1

    const-string v2, "script"

    iget-object v3, v1, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    .line 216
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "style"

    iget-object v3, v1, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 217
    :cond_2
    iget v2, v1, Ll/ܰۚ᩻;->ۛ:I

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Missing closing tag for "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v1, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v1, v2, v3}, Ll/᩶ۚ᩻;->ۙ(Ll/ܰۚ᩻;ILjava/lang/String;)V

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public static ۙ(Ljava/lang/CharSequence;Ll/۫᩸᩻;Ll/ܳۚ᩻;ZLl/ۤ᩻ᩴ;)V
    .locals 1

    .line 68
    :try_start_0
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 69
    new-instance v0, Ll/᩶ۚ᩻;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/᩶ۚ᩻;-><init>(Ljava/lang/CharSequence;Ll/۫᩸᩻;Ll/ܳۚ᩻;Z)V

    .line 70
    invoke-direct {v0}, Ll/᩶ۚ᩻;->᩸()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 71
    invoke-direct {v0}, Ll/᩶ۚ᩻;->᩷()V

    .line 72
    invoke-direct {v0}, Ll/᩶ۚ᩻;->ۙ()V

    .line 73
    invoke-direct {v0}, Ll/᩶ۚ᩻;->ۤ()V

    .line 74
    invoke-direct {v0, p4}, Ll/᩶ۚ᩻;->ۙ(Ll/ۤ᩻ᩴ;)V

    goto :goto_0

    .line 75
    :cond_0
    invoke-virtual {p4, p0}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    .line 76
    :goto_0
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V
    :try_end_0
    .catch Ll/۟ۚ᩻; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 80
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Source nesting exceeds formatter limit"

    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 78
    :catch_1
    new-instance p0, Ljava/lang/InterruptedException;

    const-string p1, "Code transformation cancelled"

    invoke-direct {p0, p1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ۙ(Ll/ۤ᩻ᩴ;)V
    .locals 31

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 236
    :goto_0
    iget-object v4, v1, Ll/᩶ۚ᩻;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    iget-object v6, v1, Ll/᩶ۚ᩻;->᩸:Ljava/lang/String;

    iget-boolean v7, v1, Ll/᩶ۚ᩻;->ۚ:Z

    iget-object v8, v1, Ll/᩶ۚ᩻;->֫:Ljava/lang/CharSequence;

    if-ge v2, v5, :cond_53

    .line 237
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰۚ᩻;

    .line 238
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 239
    iget v9, v5, Ll/ܰۚ᩻;->ۛ:I

    iget v10, v5, Ll/ܰۚ᩻;->᩺:I

    if-le v9, v3, :cond_0

    invoke-virtual {v0, v3, v9, v8}, Ll/ۤ᩻ᩴ;->ۙ(IILjava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    .line 240
    :cond_0
    new-instance v3, Ll/ܿ۫ܺ;

    invoke-direct {v3, v9, v10, v8}, Ll/ܿ۫ܺ;-><init>(IILjava/lang/CharSequence;)V

    const-string v11, "count is negative: "

    const-string v15, ""

    const-string v12, " times will produce a String exceeding maximum size."

    const-string v13, " bytes String "

    const-string v14, "Repeating "

    const v16, 0x7fffffff

    move/from16 v17, v10

    .line 241
    iget-object v10, v1, Ll/᩶ۚ᩻;->ۤ:Ljava/lang/String;

    if-eqz v7, :cond_a

    invoke-direct {v1, v2}, Ll/᩶ۚ᩻;->ۙ(I)Z

    move-result v18

    if-eqz v18, :cond_a

    .line 242
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v18

    move/from16 v19, v9

    move/from16 v9, v18

    :goto_1
    if-lez v9, :cond_1

    move-object/from16 v18, v8

    add-int/lit8 v8, v9, -0x1

    .line 243
    invoke-interface {v0, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    invoke-static {v8}, Ll/ܺۚ᩻;->ۙ(C)Z

    move-result v8

    if-eqz v8, :cond_2

    add-int/lit8 v9, v9, -0x1

    move-object/from16 v8, v18

    goto :goto_1

    :cond_1
    move-object/from16 v18, v8

    .line 244
    :cond_2
    invoke-virtual {v0, v9}, Ll/ۤ᩻ᩴ;->᩷(I)V

    .line 245
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-lez v8, :cond_9

    invoke-virtual {v0, v6}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    move-result-object v8

    iget v9, v5, Ll/ܰۚ᩻;->֫:I

    if-ltz v9, :cond_8

    .line 0
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v20

    if-eqz v9, :cond_7

    if-nez v20, :cond_3

    goto :goto_3

    :cond_3
    move-object/from16 v21, v6

    const/4 v6, 0x1

    if-ne v9, v6, :cond_4

    move-object v6, v10

    move-object/from16 v22, v15

    goto :goto_4

    :cond_4
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v6

    move-object/from16 v22, v15

    div-int v15, v16, v9

    if-gt v6, v15, :cond_6

    new-instance v6, Ljava/lang/StringBuilder;

    mul-int v15, v20, v9

    invoke-direct {v6, v15}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v15, 0x0

    :goto_2
    if-ge v15, v9, :cond_5

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v15, v15, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :cond_6
    new-instance v0, Ljava/lang/OutOfMemoryError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_3
    move-object/from16 v21, v6

    move-object/from16 v22, v15

    move-object/from16 v6, v22

    .line 245
    :goto_4
    invoke-virtual {v8, v6}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    goto :goto_6

    .line 0
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v9, v11}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    move-object/from16 v21, v6

    :goto_5
    move-object/from16 v22, v15

    goto :goto_6

    :cond_a
    move-object/from16 v21, v6

    move-object/from16 v18, v8

    move/from16 v19, v9

    goto :goto_5

    :goto_6
    if-eqz v7, :cond_b

    .line 247
    iget-boolean v6, v5, Ll/ܰۚ᩻;->֡:Z

    if-eqz v6, :cond_b

    add-int/lit8 v6, v2, 0x1

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v6, v8, :cond_b

    .line 248
    invoke-direct {v1, v6}, Ll/᩶ۚ᩻;->ۙ(I)Z

    move-result v6

    if-eqz v6, :cond_b

    iget-boolean v6, v5, Ll/ܰۚ᩻;->᩵:Z

    if-eqz v6, :cond_c

    .line 249
    :cond_b
    iget-boolean v6, v5, Ll/ܰۚ᩻;->ܶ:Z

    if-eqz v6, :cond_d

    invoke-virtual {v0, v3}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    :cond_c
    move/from16 v20, v2

    goto/16 :goto_26

    .line 250
    :cond_d
    iget v6, v5, Ll/ܰۚ᩻;->ܰ:I

    iget-boolean v8, v1, Ll/᩶ۚ᩻;->ۙ:Z

    const/4 v9, 0x1

    if-ne v6, v9, :cond_41

    iget-object v9, v5, Ll/ܰۚ᩻;->ܽ:Ll/ܰۚ᩻;

    if-eqz v9, :cond_41

    .line 399
    iget-boolean v4, v5, Ll/ܰۚ᩻;->᩵:Z

    if-nez v4, :cond_3f

    iget-boolean v4, v9, Ll/ܰۚ᩻;->᩶:Z

    if-eqz v4, :cond_3f

    iget-object v4, v9, Ll/ܰۚ᩻;->۫:Ll/ܰۚ᩻;

    if-nez v4, :cond_e

    goto/16 :goto_25

    .line 476
    :cond_e
    iget-object v4, v9, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    iget-object v6, v9, Ll/ܰۚ᩻;->ܿ:Ljava/util/HashMap;

    const-string v15, "script"

    invoke-virtual {v4, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    move/from16 v20, v2

    const-string v2, "json"

    const/16 v23, 0x2

    move-object/from16 v24, v11

    const-string v11, "css"

    move-object/from16 v25, v11

    const-string v11, "style"

    const/16 v26, 0x0

    if-nez v4, :cond_f

    iget-object v4, v9, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    move-object/from16 v27, v12

    move-object/from16 v29, v13

    move-object/from16 v23, v14

    move-object/from16 v28, v22

    goto/16 :goto_f

    :cond_f
    const-string v4, "type"

    move-object/from16 v27, v12

    move-object/from16 v12, v22

    .line 477
    invoke-static {v6, v4, v12}, Ll/ۧۚۗ;->getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v22

    check-cast v22, Ljava/lang/String;

    move-object/from16 v28, v12

    .line 478
    iget-object v12, v9, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_10

    invoke-virtual {v6, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_10

    const-string v4, "language"

    invoke-virtual {v6, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_10

    .line 479
    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_10

    new-instance v12, Ljava/lang/StringBuilder;

    move-object/from16 v29, v13

    const-string v13, "text/"

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    goto :goto_7

    :cond_10
    move-object/from16 v29, v13

    .line 480
    :goto_7
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ܺۚ᩻;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/16 v12, 0x26

    .line 482
    invoke-virtual {v4, v12}, Ljava/lang/String;->indexOf(I)I

    move-result v12

    if-gez v12, :cond_25

    const/16 v12, 0x7b

    invoke-virtual {v4, v12}, Ljava/lang/String;->indexOf(I)I

    move-result v12

    if-gez v12, :cond_25

    const-string v12, "src"

    invoke-virtual {v6, v12}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_11

    goto/16 :goto_e

    .line 483
    :cond_11
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    const-string v12, "js"

    if-eqz v6, :cond_13

    iget-object v4, v9, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_12

    goto :goto_9

    :cond_12
    :goto_8
    move-object/from16 v22, v12

    move-object/from16 v23, v14

    goto/16 :goto_d

    .line 484
    :cond_13
    iget-object v6, v9, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_14

    const-string v6, "module"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_14

    goto :goto_8

    .line 485
    :cond_14
    iget-object v6, v9, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_15

    const-string v6, "importmap"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_15

    move-object/from16 v23, v14

    goto/16 :goto_c

    :cond_15
    const/16 v6, 0x3b

    .line 486
    invoke-virtual {v4, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-ltz v6, :cond_16

    const/4 v13, 0x0

    .line 487
    invoke-virtual {v4, v13, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 488
    :cond_16
    iget-object v6, v9, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_17

    const-string v6, "text/css"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_25

    :goto_9
    move-object/from16 v23, v14

    move-object/from16 v4, v25

    goto/16 :goto_10

    :cond_17
    const/16 v6, 0x2f

    .line 489
    invoke-virtual {v4, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-gez v6, :cond_18

    goto/16 :goto_e

    :cond_18
    const/4 v11, 0x0

    .line 491
    invoke-virtual {v4, v11, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    const/4 v13, 0x3

    const/4 v15, 0x0

    move-object/from16 v22, v12

    new-array v12, v13, [Ljava/lang/Object;

    const-string v30, "text"

    aput-object v30, v12, v15

    const-string v15, "application"

    const/16 v30, 0x1

    aput-object v15, v12, v30

    const-string v15, "dojo"

    aput-object v15, v12, v23

    .line 0
    new-instance v15, Ljava/util/HashSet;

    invoke-direct {v15, v13}, Ljava/util/HashSet;-><init>(I)V

    const/16 v23, 0x0

    move-object/from16 v23, v14

    const/4 v14, 0x0

    :goto_a
    if-ge v14, v13, :cond_1a

    aget-object v13, v12, v14

    invoke-static {v13}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v15, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_19

    add-int/lit8 v14, v14, 0x1

    const/4 v13, 0x3

    goto :goto_a

    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "duplicate element: "

    invoke-static {v2, v13}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    invoke-static {v15}, Ll/ۙۚۗ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v12

    .line 492
    invoke-interface {v12, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1b

    goto/16 :goto_f

    :cond_1b
    add-int/lit8 v6, v6, 0x1

    .line 493
    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    const-string v6, "x-"

    .line 494
    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1c

    const/4 v6, 0x2

    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 495
    :cond_1c
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v6

    const/4 v11, -0x1

    sparse-switch v6, :sswitch_data_0

    goto :goto_b

    :sswitch_0
    const-string v6, "livescript"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1d

    goto :goto_b

    :cond_1d
    const/4 v11, 0x7

    goto :goto_b

    :sswitch_1
    const-string v6, "javascript"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1e

    goto :goto_b

    :cond_1e
    const/4 v11, 0x6

    goto :goto_b

    :sswitch_2
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1f

    goto :goto_b

    :cond_1f
    const/4 v11, 0x5

    goto :goto_b

    :sswitch_3
    const-string v6, "ld+json"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_20

    goto :goto_b

    :cond_20
    const/4 v11, 0x4

    goto :goto_b

    :sswitch_4
    const-string v6, "ecmascript"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_21

    goto :goto_b

    :cond_21
    const/4 v11, 0x3

    goto :goto_b

    :sswitch_5
    const-string v6, "method"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_22

    goto :goto_b

    :cond_22
    const/4 v11, 0x2

    goto :goto_b

    :sswitch_6
    const-string v6, "jscript"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_23

    goto :goto_b

    :cond_23
    const/4 v11, 0x1

    goto :goto_b

    :sswitch_7
    const-string v6, "aspect"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_24

    goto :goto_b

    :cond_24
    const/4 v11, 0x0

    :goto_b
    packed-switch v11, :pswitch_data_0

    goto :goto_f

    :goto_c
    :pswitch_0
    move-object v4, v2

    goto :goto_10

    :goto_d
    :pswitch_1
    move-object/from16 v4, v22

    goto :goto_10

    :cond_25
    :goto_e
    move-object/from16 v23, v14

    :goto_f
    move-object/from16 v4, v26

    :goto_10
    if-nez v4, :cond_26

    .line 405
    invoke-virtual {v0, v3}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    goto/16 :goto_26

    .line 408
    :cond_26
    invoke-static {v3}, Ll/᩶ۚ᩻;->ۙ(Ll/ܿ۫ܺ;)Z

    move-result v6

    if-eqz v6, :cond_27

    if-nez v8, :cond_40

    .line 409
    invoke-virtual {v0, v3}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    goto/16 :goto_26

    .line 412
    :cond_27
    iget-boolean v6, v1, Ll/᩶ۚ᩻;->᩷:Z

    if-eqz v6, :cond_28

    goto :goto_13

    :cond_28
    if-eqz v7, :cond_29

    iget v5, v9, Ll/ܰۚ᩻;->֫:I

    const/4 v8, 0x1

    add-int/2addr v5, v8

    goto :goto_11

    :cond_29
    const/4 v8, 0x1

    iget v5, v5, Ll/ܰۚ᩻;->ᩴ:I

    :goto_11
    if-ltz v5, :cond_3e

    .line 0
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v11

    if-eqz v5, :cond_2e

    if-nez v11, :cond_2a

    goto :goto_13

    :cond_2a
    if-ne v5, v8, :cond_2b

    move-object v5, v10

    goto :goto_14

    :cond_2b
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v8

    div-int v12, v16, v5

    if-gt v8, v12, :cond_2d

    new-instance v8, Ljava/lang/StringBuilder;

    mul-int v11, v11, v5

    invoke-direct {v8, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v11, 0x0

    :goto_12
    if-ge v11, v5, :cond_2c

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v11, v11, 0x1

    goto :goto_12

    :cond_2c
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_14

    :cond_2d
    new-instance v0, Ljava/lang/OutOfMemoryError;

    new-instance v2, Ljava/lang/StringBuilder;

    move-object/from16 v3, v23

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v3, v29

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v3, v27

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2e
    :goto_13
    move-object/from16 v5, v28

    .line 414
    :goto_14
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Ll/ۤ᩻ᩴ;->ۙ()Ll/ۤ᩻ᩴ;

    move-result-object v8
    :try_end_0
    .catch Ll/ۚ᩸᩻; {:try_start_0 .. :try_end_0} :catch_1

    move-object/from16 v11, v25

    .line 415
    :try_start_1
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    iget-object v12, v1, Ll/᩶ۚ᩻;->ᩴ:Ll/۫᩸᩻;

    if-eqz v11, :cond_30

    if-eqz v6, :cond_2f

    .line 416
    :try_start_2
    invoke-virtual {v12}, Ll/۫᩸᩻;->ۤ()Z

    move-result v2

    .line 45
    new-instance v12, Ll/۫᩸᩻;

    const/4 v4, 0x0

    invoke-direct {v12, v4, v4, v2}, Ll/۫᩸᩻;-><init>(IZZ)V

    sget-object v13, Ll/ۧ᩸᩻;->᩸:Ll/ۧ᩸᩻;

    sget-object v14, Ll/֫᩸᩻;->֡:Ll/֫᩸᩻;

    const/4 v15, 0x1

    move-object v11, v3

    move-object/from16 v2, v28

    move-object/from16 v22, v2

    move-object/from16 v16, v8

    invoke-static/range {v11 .. v16}, Ll/ۡ᩸᩻;->ۙ(Ljava/lang/CharSequence;Ll/۫᩸᩻;Ll/ۧ᩸᩻;Ll/֫᩸᩻;ZLl/ۤ᩻ᩴ;)V

    move-object/from16 v2, v21

    goto :goto_16

    :catchall_0
    move-exception v0

    goto/16 :goto_1b

    :cond_2f
    move-object/from16 v22, v28

    .line 417
    new-instance v13, Ll/ۧ᩸᩻;

    move-object/from16 v2, v21

    invoke-direct {v13, v5, v2}, Ll/ۧ᩸᩻;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    sget-object v14, Ll/֫᩸᩻;->֡:Ll/֫᩸᩻;

    const/4 v15, 0x0

    move-object v11, v3

    move-object/from16 v16, v8

    invoke-static/range {v11 .. v16}, Ll/ۡ᩸᩻;->ۙ(Ljava/lang/CharSequence;Ll/۫᩸᩻;Ll/ۧ᩸᩻;Ll/֫᩸᩻;ZLl/ۤ᩻ᩴ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_16

    :cond_30
    move-object/from16 v15, v21

    move-object/from16 v22, v28

    .line 419
    :try_start_3
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v2, :cond_31

    :try_start_4
    sget-object v2, Ll/ۜ᩸᩻;->ܿ:Ll/ۜ᩸᩻;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_15

    :cond_31
    :try_start_5
    sget-object v2, Ll/ۜ᩸᩻;->᩶:Ll/ۜ᩸᩻;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :goto_15
    if-eqz v6, :cond_32

    .line 420
    :try_start_6
    invoke-virtual {v12}, Ll/۫᩸᩻;->ۤ()Z

    move-result v4

    invoke-static {v3, v2, v4, v8}, Ll/۠᩸᩻;->ۙ(Ljava/lang/CharSequence;Ll/ۜ᩸᩻;ZLl/ۤ᩻ᩴ;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-object v2, v15

    goto :goto_16

    .line 421
    :cond_32
    :try_start_7
    iget-object v13, v1, Ll/᩶ۚ᩻;->ᩴ:Ll/۫᩸᩻;

    new-instance v14, Ll/۬᩸᩻;

    invoke-direct {v14, v5, v15}, Ll/۬᩸᩻;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x0

    move-object v11, v3

    move-object v12, v2

    move-object v2, v15

    move v15, v4

    move-object/from16 v16, v8

    .line 24
    invoke-static/range {v11 .. v16}, Ll/ܽ۫᩻;->ۙ(Ljava/lang/CharSequence;Ll/ۜ᩸᩻;Ll/۫᩸᩻;Ll/۬᩸᩻;ZLl/ۤ᩻ᩴ;)V

    .line 424
    :goto_16
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v4

    invoke-virtual {v3}, Ll/ܿ۫ܺ;->length()I

    move-result v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    if-ne v4, v5, :cond_33

    const/4 v4, 0x1

    goto :goto_17

    :cond_33
    const/4 v4, 0x0

    :goto_17
    const/4 v5, 0x0

    :goto_18
    if-eqz v4, :cond_36

    .line 425
    :try_start_8
    invoke-virtual {v3}, Ll/ܿ۫ܺ;->length()I

    move-result v11

    if-ge v5, v11, :cond_36

    and-int/lit16 v4, v5, 0x3ff

    if-nez v4, :cond_34

    .line 426
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 427
    :cond_34
    invoke-interface {v8, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-virtual {v3, v5}, Ll/ܿ۫ܺ;->charAt(I)C

    move-result v11

    if-ne v4, v11, :cond_35

    const/4 v4, 0x1

    goto :goto_19

    :cond_35
    const/4 v4, 0x0

    :goto_19
    add-int/lit8 v5, v5, 0x1

    goto :goto_18

    :cond_36
    if-eqz v4, :cond_37

    .line 429
    invoke-virtual {v0, v3}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 436
    :try_start_9
    invoke-virtual {v8}, Ll/ۤ᩻ᩴ;->close()V
    :try_end_9
    .catch Ll/ۚ᩸᩻; {:try_start_9 .. :try_end_9} :catch_1

    goto/16 :goto_26

    :cond_37
    if-eqz v6, :cond_38

    move-object v4, v8

    goto :goto_1e

    .line 430
    :cond_38
    :try_start_a
    new-instance v4, Ll/ۘۚ᩻;

    const/4 v5, 0x1

    .line 431
    invoke-static {v8, v5}, Ll/᩶ۚ᩻;->ۙ(Ll/ۤ᩻ᩴ;Z)Z

    move-result v5

    if-eqz v5, :cond_39

    move-object/from16 v15, v22

    goto :goto_1a

    :cond_39
    move-object v15, v2

    :goto_1a
    const/4 v5, 0x0

    .line 432
    invoke-static {v8, v5}, Ll/᩶ۚ᩻;->ۙ(Ll/ۤ᩻ᩴ;Z)Z

    move-result v5

    if-eqz v5, :cond_3a

    move-object/from16 v2, v22

    goto :goto_1d

    :cond_3a
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    if-eqz v7, :cond_3b

    :try_start_b
    iget v2, v9, Ll/ܰۚ᩻;->֫:I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    goto :goto_1c

    :goto_1b
    move-object v2, v0

    move-object/from16 v10, v18

    goto :goto_21

    :cond_3b
    :try_start_c
    iget v2, v9, Ll/ܰۚ᩻;->ᩴ:I

    :goto_1c
    invoke-static {v2, v10}, Ll/ܰۡۗ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1d
    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/CharSequence;

    const/4 v6, 0x0

    aput-object v15, v5, v6

    const/4 v6, 0x1

    aput-object v8, v5, v6

    const/4 v6, 0x2

    aput-object v2, v5, v6

    invoke-direct {v4, v5}, Ll/ۘۚ᩻;-><init>([Ljava/lang/CharSequence;)V

    .line 433
    :goto_1e
    new-instance v2, Ll/ܿ۫ܺ;

    iget-object v5, v9, Ll/ܰۚ᩻;->۫:Ll/ܰۚ᩻;

    iget v6, v5, Ll/ܰۚ᩻;->ۛ:I

    iget v5, v5, Ll/ܰۚ᩻;->᩺:I
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    move-object/from16 v10, v18

    :try_start_d
    invoke-direct {v2, v6, v5, v10}, Ll/ܿ۫ܺ;-><init>(IILjava/lang/CharSequence;)V

    .line 434
    new-instance v5, Ll/ۘۚ᩻;

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/CharSequence;

    const/4 v7, 0x0

    aput-object v4, v6, v7

    const/4 v7, 0x1

    aput-object v2, v6, v7

    invoke-direct {v5, v6}, Ll/ۘۚ᩻;-><init>([Ljava/lang/CharSequence;)V

    iget-object v2, v9, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    invoke-static {v5, v2}, Ll/ܺۚ᩻;->ۙ(Ljava/lang/CharSequence;Ljava/lang/String;)I

    move-result v2

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-eq v2, v5, :cond_3c

    invoke-virtual {v0, v3}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    goto :goto_1f

    .line 435
    :cond_3c
    invoke-virtual {v0, v4}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 436
    :goto_1f
    :try_start_e
    invoke-virtual {v8}, Ll/ۤ᩻ᩴ;->close()V
    :try_end_e
    .catch Ll/ۚ᩸᩻; {:try_start_e .. :try_end_e} :catch_0

    goto :goto_26

    :catchall_1
    move-exception v0

    goto :goto_20

    :catchall_2
    move-exception v0

    move-object/from16 v10, v18

    :goto_20
    move-object v2, v0

    .line 414
    :goto_21
    :try_start_f
    invoke-virtual {v8}, Ll/ۤ᩻ᩴ;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    goto :goto_22

    :catchall_3
    move-exception v0

    move-object v3, v0

    :try_start_10
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_22
    throw v2
    :try_end_10
    .catch Ll/ۚ᩸᩻; {:try_start_10 .. :try_end_10} :catch_0

    :catch_0
    move-exception v0

    goto :goto_23

    :catch_1
    move-exception v0

    move-object/from16 v10, v18

    .line 438
    :goto_23
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    move/from16 v3, v19

    invoke-static {v2, v10, v3}, Ll/ۢۚ᩻;->ۙ(Ljava/lang/String;Ljava/lang/CharSequence;I)Ll/ۚ᩸᩻;

    move-result-object v2

    .line 439
    new-instance v3, Ll/ۚ᩸᩻;

    invoke-virtual {v2}, Ll/ۚ᩸᩻;->᩷()I

    move-result v4

    invoke-virtual {v0}, Ll/ۚ᩸᩻;->᩷()I

    move-result v5

    add-int/2addr v5, v4

    const/4 v4, 0x1

    sub-int/2addr v5, v4

    .line 440
    invoke-virtual {v0}, Ll/ۚ᩸᩻;->᩷()I

    move-result v6

    if-ne v6, v4, :cond_3d

    invoke-virtual {v2}, Ll/ۚ᩸᩻;->ۙ()I

    move-result v2

    invoke-virtual {v0}, Ll/ۚ᩸᩻;->ۙ()I

    move-result v6

    add-int/2addr v6, v2

    sub-int/2addr v6, v4

    goto :goto_24

    :cond_3d
    invoke-virtual {v0}, Ll/ۚ᩸᩻;->ۙ()I

    move-result v6

    :goto_24
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v5, v6, v0}, Ll/ۚ᩸᩻;-><init>(IILjava/lang/String;)V

    throw v3

    .line 0
    :cond_3e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    move-object/from16 v2, v24

    invoke-static {v5, v2}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3f
    :goto_25
    move/from16 v20, v2

    .line 400
    invoke-virtual {v0, v3}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    :cond_40
    :goto_26
    move/from16 v2, v20

    goto/16 :goto_2b

    :cond_41
    move/from16 v20, v2

    .line 251
    iget-object v2, v5, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    const/16 v7, 0x20

    if-eqz v2, :cond_47

    iget-boolean v2, v5, Ll/ܰۚ᩻;->᩶:Z

    if-eqz v2, :cond_47

    iget-boolean v2, v5, Ll/ܰۚ᩻;->᩵:Z

    if-nez v2, :cond_47

    .line 382
    iget-boolean v2, v5, Ll/ܰۚ᩻;->ۤ:Z

    iget-object v3, v5, Ll/ܰۚ᩻;->ۙ:Ljava/util/ArrayList;

    if-eqz v2, :cond_42

    const-string v2, "</"

    goto :goto_27

    :cond_42
    const-string v2, "<"

    :goto_27
    invoke-virtual {v0, v2}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    move-result-object v2

    iget-object v4, v5, Ll/ܰۚ᩻;->ܺ:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    .line 383
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_43
    :goto_28
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_44

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛۚ᩻;

    .line 384
    invoke-virtual {v0, v7}, Ll/ۤ᩻ᩴ;->append(C)Ll/ۤ᩻ᩴ;

    iget-object v6, v4, Ll/ۛۚ᩻;->᩷:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    .line 385
    iget-boolean v6, v4, Ll/ۛۚ᩻;->ۙ:Z

    if-eqz v6, :cond_43

    const/16 v6, 0x3d

    invoke-virtual {v0, v6}, Ll/ۤ᩻ᩴ;->append(C)Ll/ۤ᩻ᩴ;

    iget-object v4, v4, Ll/ۛۚ᩻;->ۤ:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    goto :goto_28

    .line 387
    :cond_44
    iget-boolean v2, v5, Ll/ܰۚ᩻;->ۨ:Z

    if-eqz v2, :cond_46

    .line 389
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_45

    const/4 v2, 0x1

    .line 0
    invoke-static {v3, v2}, Lcom/umeng/analytics/pro/j$$ExternalSyntheticOutline0;->m(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v2

    .line 390
    check-cast v2, Ll/ۛۚ᩻;

    iget-object v2, v2, Ll/ۛۚ᩻;->ۤ:Ljava/lang/String;

    if-eqz v2, :cond_45

    const/4 v3, 0x0

    .line 391
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x27

    if-eq v4, v5, :cond_45

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x22

    if-eq v2, v3, :cond_45

    invoke-virtual {v0, v7}, Ll/ۤ᩻ᩴ;->append(C)Ll/ۤ᩻ᩴ;

    :cond_45
    const-string v2, "/>"

    .line 393
    invoke-virtual {v0, v2}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    goto :goto_26

    :cond_46
    const/16 v2, 0x3e

    .line 394
    invoke-virtual {v0, v2}, Ll/ۤ᩻ᩴ;->append(C)Ll/ۤ᩻ᩴ;

    goto/16 :goto_26

    :cond_47
    if-eqz v8, :cond_51

    const/16 v2, 0x8

    if-ne v6, v2, :cond_51

    .line 252
    iget-boolean v2, v5, Ll/ܰۚ᩻;->᩵:Z

    if-nez v2, :cond_51

    iget-object v2, v5, Ll/ܰۚ᩻;->ܽ:Ll/ܰۚ᩻;

    if-eqz v2, :cond_48

    iget-boolean v2, v2, Ll/ܰۚ᩻;->᩶:Z

    if-eqz v2, :cond_51

    :cond_48
    move/from16 v2, v20

    .line 270
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰۚ᩻;

    .line 271
    invoke-static {v3}, Ll/᩶ۚ᩻;->ۙ(Ll/ܿ۫ܺ;)Z

    move-result v6

    if-eqz v6, :cond_4d

    .line 272
    iget-object v3, v5, Ll/ܰۚ᩻;->ܽ:Ll/ܰۚ᩻;

    if-nez v3, :cond_49

    if-eqz v2, :cond_52

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ne v3, v6, :cond_49

    goto/16 :goto_2b

    :cond_49
    add-int/lit8 v3, v2, 0x1

    .line 273
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v3, v6, :cond_4c

    .line 274
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܰۚ᩻;

    iget v6, v6, Ll/ܰۚ᩻;->᩷:I

    const/4 v8, 0x1

    if-ne v6, v8, :cond_4a

    goto/16 :goto_2b

    .line 275
    :cond_4a
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰۚ᩻;

    .line 276
    iget-boolean v6, v3, Ll/ܰۚ᩻;->᩶:Z

    if-eqz v6, :cond_4c

    iget-boolean v6, v3, Ll/ܰۚ᩻;->᩵:Z

    if-nez v6, :cond_4c

    sget-object v6, Ll/᩶ۚ᩻;->ۧ:Ljava/util/Set;

    iget-object v8, v3, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    invoke-interface {v6, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4c

    if-lez v2, :cond_4b

    .line 278
    iget-boolean v6, v3, Ll/ܰۚ᩻;->ۤ:Z

    if-eqz v6, :cond_4b

    iget-object v3, v3, Ll/ܰۚ᩻;->᩻:Ll/ܰۚ᩻;

    add-int/lit8 v6, v2, -0x1

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    if-ne v3, v6, :cond_4b

    goto :goto_2b

    :cond_4b
    if-lez v2, :cond_4c

    add-int/lit8 v3, v2, -0x1

    .line 279
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰۚ᩻;

    iget v3, v3, Ll/ܰۚ᩻;->ܰ:I

    const/4 v4, 0x4

    if-ne v3, v4, :cond_4c

    iget-object v3, v5, Ll/ܰۚ᩻;->ܽ:Ll/ܰۚ᩻;

    if-nez v3, :cond_4c

    goto :goto_2b

    .line 283
    :cond_4c
    invoke-virtual {v0, v7}, Ll/ۤ᩻ᩴ;->append(C)Ll/ۤ᩻ᩴ;

    goto :goto_2b

    :cond_4d
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 287
    :goto_29
    invoke-virtual {v3}, Ll/ܿ۫ܺ;->length()I

    move-result v6

    if-ge v4, v6, :cond_52

    and-int/lit16 v6, v4, 0x3ff

    if-nez v6, :cond_4e

    .line 288
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 289
    :cond_4e
    invoke-virtual {v3, v4}, Ll/ܿ۫ܺ;->charAt(I)C

    move-result v6

    .line 290
    invoke-static {v6}, Ll/ܺۚ᩻;->ۙ(C)Z

    move-result v8

    if-eqz v8, :cond_50

    if-nez v5, :cond_4f

    .line 291
    invoke-virtual {v0, v7}, Ll/ۤ᩻ᩴ;->append(C)Ll/ۤ᩻ᩴ;

    :cond_4f
    const/4 v5, 0x1

    goto :goto_2a

    .line 294
    :cond_50
    invoke-virtual {v0, v6}, Ll/ۤ᩻ᩴ;->append(C)Ll/ۤ᩻ᩴ;

    const/4 v5, 0x0

    :goto_2a
    add-int/lit8 v4, v4, 0x1

    goto :goto_29

    :cond_51
    move/from16 v2, v20

    .line 254
    invoke-virtual {v0, v3}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    :cond_52
    :goto_2b
    add-int/lit8 v2, v2, 0x1

    move/from16 v3, v17

    goto/16 :goto_0

    :cond_53
    move-object v2, v6

    move-object v10, v8

    .line 258
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ge v3, v5, :cond_54

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v5

    invoke-virtual {v0, v3, v5, v10}, Ll/ۤ᩻ᩴ;->ۙ(IILjava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    :cond_54
    if-eqz v7, :cond_56

    .line 259
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_56

    const/4 v3, 0x1

    .line 0
    invoke-static {v4, v3}, Lcom/umeng/analytics/pro/j$$ExternalSyntheticOutline0;->m(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v3

    .line 260
    check-cast v3, Ll/ܰۚ᩻;

    .line 261
    iget-boolean v5, v3, Ll/ܰۚ᩻;->֡:Z

    if-eqz v5, :cond_55

    iget v5, v3, Ll/ܰۚ᩻;->ۗ:I

    if-ltz v5, :cond_55

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰۚ᩻;

    .line 262
    :cond_55
    iget-boolean v4, v3, Ll/ܰۚ᩻;->ܳ:Z

    if-eqz v4, :cond_56

    iget-boolean v4, v3, Ll/ܰۚ᩻;->ۤ:Z

    if-eqz v4, :cond_56

    iget-object v4, v3, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    const-string v5, "html"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_56

    iget-boolean v3, v3, Ll/ܰۚ᩻;->᩵:Z

    if-nez v3, :cond_56

    .line 263
    invoke-virtual {v0, v2}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    :cond_56
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x53f0eba8 -> :sswitch_7
        -0x4ec5a64b -> :sswitch_6
        -0x403a2f1f -> :sswitch_5
        -0x388d1203 -> :sswitch_4
        -0x1aa82e5 -> :sswitch_3
        0x31ece8 -> :sswitch_2
        0xb43d96d -> :sswitch_1
        0x699320b7 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private ۙ(Ll/ܰۚ᩻;ILjava/lang/String;)V
    .locals 1

    .line 167
    iget-object v0, p0, Ll/᩶ۚ᩻;->ᩴ:Ll/۫᩸᩻;

    invoke-virtual {v0}, Ll/۫᩸᩻;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean p1, p1, Ll/ܰۚ᩻;->ܶ:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ll/᩶ۚ᩻;->֫:Ljava/lang/CharSequence;

    invoke-static {p3, p1, p2}, Ll/ۢۚ᩻;->ۙ(Ljava/lang/String;Ljava/lang/CharSequence;I)Ll/ۚ᩸᩻;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method private ۙ(I)Z
    .locals 4

    .line 376
    iget-object v0, p0, Ll/᩶ۚ᩻;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰۚ᩻;

    .line 377
    iget v1, v1, Ll/ܰۚ᩻;->᩷:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    if-lez p1, :cond_0

    sub-int/2addr p1, v2

    .line 378
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܰۚ᩻;

    iget-boolean p1, p1, Ll/ܰۚ᩻;->֡:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    return v2
.end method

.method public static ۙ(Ll/ۤ᩻ᩴ;Z)Z
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    .line 467
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    sub-int/2addr v2, v0

    :goto_0
    if-ltz v2, :cond_5

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v2, v3, :cond_5

    .line 468
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0xd

    if-eq v3, v4, :cond_4

    const/16 v4, 0xa

    if-ne v3, v4, :cond_1

    goto :goto_2

    .line 470
    :cond_1
    invoke-static {v3}, Ll/ܺۚ᩻;->ۙ(C)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_3

    :cond_2
    if-eqz p1, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, -0x1

    :goto_1
    add-int/2addr v2, v3

    goto :goto_0

    :cond_4
    :goto_2
    return v0

    :cond_5
    :goto_3
    return v1
.end method

.method private ۙ(Ll/ܰۚ᩻;)Z
    .locals 5

    .line 371
    iget v0, p1, Ll/ܰۚ᩻;->ۛ:I

    iget v1, p1, Ll/ܰۚ᩻;->ܰ:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    const-string v1, "<!doctype"

    iget-object v2, p0, Ll/᩶ۚ᩻;->֫:Ljava/lang/CharSequence;

    const/4 v3, 0x1

    const/16 v4, 0x9

    invoke-static {v2, v3, v0, v1, v4}, Ll/ᩳۚۤ;->ۙ(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget p1, p1, Ll/ܰۚ᩻;->᩺:I

    add-int/2addr v0, v4

    if-le p1, v0, :cond_0

    sub-int/2addr p1, v3

    .line 372
    invoke-interface {v2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    const/16 v0, 0x3e

    if-ne p1, v0, :cond_0

    return v3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static ۙ(Ll/ܿ۫ܺ;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 510
    :goto_0
    invoke-virtual {p0}, Ll/ܿ۫ܺ;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    and-int/lit16 v2, v1, 0x3ff

    if-nez v2, :cond_0

    .line 511
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 512
    :cond_0
    invoke-virtual {p0, v1}, Ll/ܿ۫ܺ;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ll/ܺۚ᩻;->ۙ(C)Z

    move-result v2

    if-nez v2, :cond_1

    return v0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method private ۤ()V
    .locals 13

    const/4 v0, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 303
    :goto_0
    iget-object v3, p0, Ll/᩶ۚ᩻;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x1

    if-ge v2, v4, :cond_9

    .line 304
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 305
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰۚ᩻;

    .line 306
    iput v0, v3, Ll/ܰۚ᩻;->ۗ:I

    .line 307
    iget-object v4, v3, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    if-eqz v4, :cond_4

    iget-boolean v6, v3, Ll/ܰۚ᩻;->ۚ:Z

    if-nez v6, :cond_4

    iget-boolean v6, v3, Ll/ܰۚ᩻;->᩶:Z

    if-eqz v6, :cond_4

    iget-boolean v6, v3, Ll/ܰۚ᩻;->ۤ:Z

    if-eqz v6, :cond_0

    iget-object v4, v3, Ll/ܰۚ᩻;->᩻:Ll/ܰۚ᩻;

    if-eqz v4, :cond_4

    iget-boolean v4, v4, Ll/ܰۚ᩻;->ܳ:Z

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_0
    const-string v6, "html"

    .line 309
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, v3, Ll/ܰۚ᩻;->ܽ:Ll/ܰۚ᩻;

    if-eqz v4, :cond_3

    :cond_1
    iget-object v4, v3, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    const-string v7, "head"

    .line 310
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, v3, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    const-string v7, "body"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_2
    iget-object v4, v3, Ll/ܰۚ᩻;->ܽ:Ll/ܰۚ᩻;

    if-eqz v4, :cond_3

    iget-boolean v7, v4, Ll/ܰۚ᩻;->ܳ:Z

    if-eqz v7, :cond_4

    iget-object v4, v4, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    .line 311
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_3
    :goto_1
    const/4 v4, 0x1

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    :goto_2
    iput-boolean v4, v3, Ll/ܰۚ᩻;->ܳ:Z

    if-eqz v4, :cond_5

    goto :goto_3

    .line 312
    :cond_5
    iget-boolean v4, v3, Ll/ܰۚ᩻;->ۤ:Z

    if-eqz v4, :cond_6

    iget-object v4, v3, Ll/ܰۚ᩻;->᩻:Ll/ܰۚ᩻;

    if-eqz v4, :cond_6

    .line 313
    iget v4, v4, Ll/ܰۚ᩻;->֫:I

    goto :goto_4

    :cond_6
    iget-object v4, v3, Ll/ܰۚ᩻;->ܽ:Ll/ܰۚ᩻;

    if-nez v4, :cond_7

    :goto_3
    const/4 v4, 0x0

    goto :goto_4

    :cond_7
    iget v4, v4, Ll/ܰۚ᩻;->֫:I

    add-int/2addr v4, v5

    :goto_4
    iput v4, v3, Ll/ܰۚ᩻;->֫:I

    .line 314
    iget-boolean v3, v3, Ll/ܰۚ᩻;->֡:Z

    if-nez v3, :cond_8

    move v0, v2

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_9
    const/4 v0, 0x0

    .line 316
    :goto_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_2b

    .line 317
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 318
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۚ᩻;

    .line 325
    iget-boolean v4, v2, Ll/ܰۚ᩻;->֡:Z

    if-nez v4, :cond_29

    iget-boolean v4, v2, Ll/ܰۚ᩻;->ܶ:Z

    if-eqz v4, :cond_a

    iget-object v4, v2, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    if-eqz v4, :cond_29

    iget-boolean v4, v2, Ll/ܰۚ᩻;->᩵:Z

    if-nez v4, :cond_29

    :cond_a
    iget-boolean v4, v2, Ll/ܰۚ᩻;->ۚ:Z

    if-nez v4, :cond_29

    iget-object v4, v2, Ll/ܰۚ᩻;->ܽ:Ll/ܰۚ᩻;

    if-eqz v4, :cond_b

    iget-boolean v4, v4, Ll/ܰۚ᩻;->᩵:Z

    if-eqz v4, :cond_b

    goto/16 :goto_9

    .line 327
    :cond_b
    iget v4, v2, Ll/ܰۚ᩻;->ۗ:I

    if-gez v4, :cond_c

    const/4 v4, 0x0

    goto :goto_6

    :cond_c
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰۚ᩻;

    :goto_6
    if-eqz v4, :cond_d

    .line 329
    iget-boolean v6, v4, Ll/ܰۚ᩻;->ܶ:Z

    if-eqz v6, :cond_d

    iget-object v6, v4, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    if-eqz v6, :cond_29

    iget-boolean v6, v4, Ll/ܰۚ᩻;->᩵:Z

    if-eqz v6, :cond_d

    goto/16 :goto_9

    .line 330
    :cond_d
    iget v6, v2, Ll/ܰۚ᩻;->ܰ:I

    const/4 v7, 0x4

    if-ne v6, v7, :cond_e

    iget-object v4, v2, Ll/ܰۚ᩻;->ܽ:Ll/ܰۚ᩻;

    if-nez v4, :cond_29

    invoke-direct {p0, v2}, Ll/᩶ۚ᩻;->ۙ(Ll/ܰۚ᩻;)Z

    move-result v4

    if-eqz v4, :cond_29

    goto/16 :goto_8

    .line 331
    :cond_e
    iget-object v8, v2, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    if-eqz v8, :cond_10

    iget-boolean v9, v2, Ll/ܰۚ᩻;->᩶:Z

    if-eqz v9, :cond_29

    iget-boolean v9, v2, Ll/ܰۚ᩻;->ۤ:Z

    if-eqz v9, :cond_f

    iget-object v10, v2, Ll/ܰۚ᩻;->᩻:Ll/ܰۚ᩻;

    if-eqz v10, :cond_29

    :cond_f
    if-eqz v9, :cond_10

    iget-boolean v9, v2, Ll/ܰۚ᩻;->᩵:Z

    if-eqz v9, :cond_10

    goto/16 :goto_9

    .line 333
    :cond_10
    iget-boolean v9, v2, Ll/ܰۚ᩻;->ܳ:Z

    if-eqz v9, :cond_11

    goto/16 :goto_8

    .line 334
    :cond_11
    iget-object v9, v2, Ll/ܰۚ᩻;->ܽ:Ll/ܰۚ᩻;

    if-eqz v9, :cond_12

    iget-boolean v10, v9, Ll/ܰۚ᩻;->ۘ:Z

    if-eqz v10, :cond_12

    goto/16 :goto_9

    :cond_12
    const/4 v10, 0x2

    .line 335
    sget-object v11, Ll/᩶ۚ᩻;->ۧ:Ljava/util/Set;

    if-ne v6, v10, :cond_14

    if-eqz v9, :cond_13

    .line 336
    iget-object v6, v9, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    invoke-interface {v11, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_13

    goto/16 :goto_9

    :cond_13
    if-eqz v4, :cond_28

    .line 337
    invoke-direct {p0, v4}, Ll/᩶ۚ᩻;->᩷(Ll/ܰۚ᩻;)Z

    move-result v4

    if-eqz v4, :cond_2a

    goto/16 :goto_8

    :cond_14
    if-eqz v8, :cond_29

    .line 341
    iget-boolean v6, v2, Ll/ܰۚ᩻;->ۤ:Z

    if-eqz v6, :cond_15

    iget-object v6, v2, Ll/ܰۚ᩻;->᩻:Ll/ܰۚ᩻;

    iget-boolean v6, v6, Ll/ܰۚ᩻;->ۘ:Z

    if-eqz v6, :cond_15

    goto/16 :goto_9

    :cond_15
    if-nez v4, :cond_16

    .line 342
    invoke-interface {v11, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    goto/16 :goto_a

    .line 343
    :cond_16
    iget v6, v4, Ll/ܰۚ᩻;->ܰ:I

    if-ne v6, v5, :cond_17

    goto/16 :goto_9

    .line 344
    :cond_17
    iget-object v12, v4, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    if-nez v12, :cond_24

    if-eq v6, v10, :cond_24

    if-eq v6, v7, :cond_24

    .line 348
    iget-object v6, v4, Ll/ܰۚ᩻;->ܽ:Ll/ܰۚ᩻;

    if-eqz v6, :cond_29

    if-eq v6, v9, :cond_29

    iget-boolean v8, v6, Ll/ܰۚ᩻;->᩵:Z

    if-nez v8, :cond_29

    iget-object v6, v6, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    .line 347
    invoke-interface {v11, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_29

    iget-boolean v6, v2, Ll/ܰۚ᩻;->ۤ:Z

    if-nez v6, :cond_28

    iget-object v4, v4, Ll/ܰۚ᩻;->ܽ:Ll/ܰۚ᩻;

    iget-object v4, v4, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    iget-object v6, v2, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    const-string v8, "p"

    .line 223
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1a

    invoke-interface {v11, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1a

    const/4 v8, 0x5

    new-array v9, v8, [Ljava/lang/Object;

    const-string v11, "script"

    aput-object v11, v9, v1

    const-string v11, "style"

    aput-object v11, v9, v5

    const-string v11, "meta"

    aput-object v11, v9, v10

    const-string v10, "link"

    const/4 v11, 0x3

    aput-object v10, v9, v11

    const-string v10, "base"

    aput-object v10, v9, v7

    .line 0
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7, v8}, Ljava/util/HashSet;-><init>(I)V

    const/4 v10, 0x0

    :goto_7
    if-ge v10, v8, :cond_19

    aget-object v11, v9, v10

    invoke-static {v11}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_18

    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "duplicate element: "

    invoke-static {v1, v11}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    invoke-static {v7}, Ll/ۙۚۗ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v7

    .line 223
    invoke-interface {v7, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_28

    :cond_1a
    const-string v7, "li"

    .line 224
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1b

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    :cond_1b
    const-string v7, "dt"

    .line 225
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const-string v9, "dd"

    if-nez v8, :cond_1c

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1d

    :cond_1c
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    :cond_1d
    const-string v7, "option"

    .line 226
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const-string v9, "optgroup"

    if-eqz v8, :cond_1e

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    .line 227
    :cond_1e
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1f

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    :cond_1f
    const-string v7, "tr"

    .line 228
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_20

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    :cond_20
    const-string v7, "td"

    .line 229
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const-string v9, "th"

    if-nez v8, :cond_21

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_22

    :cond_21
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    :cond_22
    const-string v7, "thead"

    .line 230
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const-string v8, "tfoot"

    const-string v9, "tbody"

    if-nez v7, :cond_23

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_23

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_29

    .line 231
    :cond_23
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_28

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_29

    goto :goto_8

    .line 350
    :cond_24
    iget-object v6, v2, Ll/ܰۚ᩻;->᩻:Ll/ܰۚ᩻;

    if-ne v6, v4, :cond_25

    goto :goto_9

    .line 351
    :cond_25
    invoke-interface {v11, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_26

    .line 352
    invoke-direct {p0, v4}, Ll/᩶ۚ᩻;->᩷(Ll/ܰۚ᩻;)Z

    move-result v4

    if-eqz v4, :cond_2a

    goto :goto_8

    .line 355
    :cond_26
    iget-object v6, v2, Ll/ܰۚ᩻;->ܽ:Ll/ܰۚ᩻;

    if-eqz v6, :cond_29

    iget-boolean v7, v6, Ll/ܰۚ᩻;->ܳ:Z

    if-nez v7, :cond_27

    iget-object v6, v6, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    const/16 v7, 0x3a

    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-ltz v6, :cond_29

    .line 356
    :cond_27
    invoke-direct {p0, v4}, Ll/᩶ۚ᩻;->᩷(Ll/ܰۚ᩻;)Z

    move-result v4

    if-eqz v4, :cond_2a

    :cond_28
    :goto_8
    const/4 v10, 0x1

    goto :goto_a

    :cond_29
    :goto_9
    const/4 v10, 0x0

    .line 319
    :cond_2a
    :goto_a
    iput v10, v2, Ll/ܰۚ᩻;->᩷:I

    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_5

    :cond_2b
    return-void
.end method

.method private ᩷()V
    .locals 10

    .line 180
    new-instance v0, Ll/ۧۚ᩻;

    invoke-direct {v0}, Ll/ۧۚ᩻;-><init>()V

    .line 181
    iget-object v1, p0, Ll/᩶ۚ᩻;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۚ᩻;

    .line 182
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 185
    iget-object v3, v2, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    iget v4, v2, Ll/ܰۚ᩻;->ܰ:I

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    iget-boolean v6, v2, Ll/ܰۚ᩻;->᩸:Z

    if-eqz v6, :cond_2

    .line 186
    iget-boolean v6, v2, Ll/ܰۚ᩻;->ۤ:Z

    if-eqz v6, :cond_1

    invoke-virtual {v0, v3}, Ll/ۧۚ᩻;->ۙ(Ljava/lang/String;)Ll/֫ۚ᩻;

    move-result-object v3

    goto :goto_1

    .line 187
    :cond_1
    iget-object v6, v2, Ll/ܰۚ᩻;->ܿ:Ljava/util/HashMap;

    iget-boolean v7, v2, Ll/ܰۚ᩻;->ۨ:Z

    invoke-virtual {v0, v3, v6, v7, v2}, Ll/ۧۚ᩻;->ۙ(Ljava/lang/String;Ljava/util/Map;ZLjava/lang/Object;)Ll/֫ۚ᩻;

    move-result-object v3

    .line 188
    :goto_1
    iget-boolean v6, v2, Ll/ܰۚ᩻;->ۤ:Z

    if-eqz v6, :cond_3

    if-eqz v3, :cond_3

    .line 189
    iget-object v6, v3, Ll/֫ۚ᩻;->ۚ:Ljava/lang/Object;

    check-cast v6, Ll/ܰۚ᩻;

    iput-object v2, v6, Ll/ܰۚ᩻;->۫:Ll/ܰۚ᩻;

    .line 190
    iput-object v6, v2, Ll/ܰۚ᩻;->᩻:Ll/ܰۚ᩻;

    goto :goto_2

    :cond_2
    move-object v3, v5

    :cond_3
    :goto_2
    if-eqz v3, :cond_4

    .line 193
    iget-boolean v6, v2, Ll/ܰۚ᩻;->ۤ:Z

    if-nez v6, :cond_4

    iget-object v6, v3, Ll/֫ۚ᩻;->ܳ:Ll/֫ۚ᩻;

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Ll/ۧۚ᩻;->ۙ()Ll/֫ۚ᩻;

    move-result-object v6

    :goto_3
    if-eqz v3, :cond_5

    .line 194
    iget-boolean v7, v2, Ll/ܰۚ᩻;->ۤ:Z

    if-nez v7, :cond_5

    iget v7, v3, Ll/֫ۚ᩻;->ۙ:I

    goto :goto_4

    :cond_5
    invoke-virtual {v0}, Ll/ۧۚ᩻;->᩷()I

    move-result v7

    :goto_4
    iput v7, v2, Ll/ܰۚ᩻;->ᩴ:I

    if-nez v6, :cond_6

    goto :goto_5

    .line 195
    :cond_6
    iget-object v5, v6, Ll/֫ۚ᩻;->ۚ:Ljava/lang/Object;

    check-cast v5, Ll/ܰۚ᩻;

    :goto_5
    iput-object v5, v2, Ll/ܰۚ᩻;->ܽ:Ll/ܰۚ᩻;

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v3, :cond_7

    .line 196
    iget v9, v3, Ll/֫ۚ᩻;->ᩴ:I

    if-eqz v9, :cond_8

    goto :goto_6

    :cond_7
    if-eqz v6, :cond_8

    .line 197
    iget v9, v6, Ll/֫ۚ᩻;->ᩴ:I

    if-eqz v9, :cond_8

    :goto_6
    const/4 v9, 0x1

    goto :goto_7

    :cond_8
    const/4 v9, 0x0

    :goto_7
    iput-boolean v9, v2, Ll/ܰۚ᩻;->ۚ:Z

    if-eqz v3, :cond_9

    .line 198
    iget-boolean v3, v3, Ll/֫ۚ᩻;->۫:Z

    if-nez v3, :cond_a

    :cond_9
    if-eqz v6, :cond_b

    iget-boolean v3, v6, Ll/֫ۚ᩻;->۫:Z

    if-eqz v3, :cond_b

    :cond_a
    const/4 v3, 0x1

    goto :goto_8

    :cond_b
    const/4 v3, 0x0

    :goto_8
    iput-boolean v3, v2, Ll/ܰۚ᩻;->᩵:Z

    .line 200
    iget-boolean v6, v2, Ll/ܰۚ᩻;->᩹:Z

    if-nez v6, :cond_e

    if-eqz v5, :cond_c

    iget-boolean v5, v5, Ll/ܰۚ᩻;->᩵:Z

    if-nez v5, :cond_e

    :cond_c
    iget-object v5, v2, Ll/ܰۚ᩻;->᩻:Ll/ܰۚ᩻;

    if-eqz v5, :cond_d

    iget-boolean v5, v5, Ll/ܰۚ᩻;->᩵:Z

    if-eqz v5, :cond_d

    goto :goto_9

    :cond_d
    const/4 v5, 0x0

    goto :goto_a

    :cond_e
    :goto_9
    const/4 v5, 0x1

    :goto_a
    or-int/2addr v3, v5

    iput-boolean v3, v2, Ll/ܰۚ᩻;->᩵:Z

    const/16 v3, 0x8

    if-ne v4, v3, :cond_f

    .line 202
    new-instance v3, Ll/ܿ۫ܺ;

    iget v5, v2, Ll/ܰۚ᩻;->ۛ:I

    iget v6, v2, Ll/ܰۚ᩻;->᩺:I

    iget-object v9, p0, Ll/᩶ۚ᩻;->֫:Ljava/lang/CharSequence;

    invoke-direct {v3, v5, v6, v9}, Ll/ܿ۫ܺ;-><init>(IILjava/lang/CharSequence;)V

    invoke-static {v3}, Ll/᩶ۚ᩻;->ۙ(Ll/ܿ۫ܺ;)Z

    move-result v3

    if-eqz v3, :cond_f

    const/4 v7, 0x1

    :cond_f
    iput-boolean v7, v2, Ll/ܰۚ᩻;->֡:Z

    .line 203
    iget-object v3, v2, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    if-nez v3, :cond_0

    iget-object v2, v2, Ll/ܰۚ᩻;->ܽ:Ll/ܰۚ᩻;

    if-eqz v2, :cond_0

    const/4 v3, 0x2

    if-eq v4, v3, :cond_0

    if-eq v4, v8, :cond_0

    if-nez v7, :cond_0

    .line 205
    iput-boolean v8, v2, Ll/ܰۚ᩻;->ۘ:Z

    goto/16 :goto_0

    :cond_10
    return-void
.end method

.method private ᩷(Ll/ܰۚ᩻;)Z
    .locals 4

    .line 363
    iget-boolean v0, p1, Ll/ܰۚ᩻;->ۤ:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Ll/ܰۚ᩻;->᩻:Ll/ܰۚ᩻;

    goto :goto_0

    :cond_0
    move-object v0, p1

    .line 364
    :goto_0
    iget-object v1, p1, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iget-boolean v3, p1, Ll/ܰۚ᩻;->᩶:Z

    if-eqz v3, :cond_1

    sget-object v3, Ll/᩶ۚ᩻;->ۧ:Ljava/util/Set;

    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Ll/᩶ۚ᩻;->᩻:Ljava/util/Set;

    iget-object v3, p1, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    .line 365
    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    if-eqz v0, :cond_1

    iget v0, v0, Ll/ܰۚ᩻;->᩷:I

    if-eq v0, v2, :cond_3

    :cond_1
    iget v0, p1, Ll/ܰۚ᩻;->ܰ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    iget v1, p1, Ll/ܰۚ᩻;->᩷:I

    if-eq v1, v2, :cond_3

    :cond_2
    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    .line 367
    invoke-direct {p0, p1}, Ll/᩶ۚ᩻;->ۙ(Ll/ܰۚ᩻;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    return v2

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method private ᩸()Z
    .locals 20

    move-object/from16 v0, p0

    .line 85
    new-instance v1, Ll/᩻ۚ᩻;

    new-instance v2, Ll/ᩳۚ᩻;

    iget-object v3, v0, Ll/᩶ۚ᩻;->۫:Ll/֡ۚ᩻;

    invoke-virtual {v3}, Ll/֡ۚ᩻;->ۙ()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-direct {v2, v4}, Ll/ᩳۚ᩻;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v1, v2}, Ll/᩻ۚ᩻;-><init>(Ll/ᩳۚ᩻;)V

    .line 86
    invoke-virtual {v1}, Ll/ۡܺۨ;->ۧ()V

    .line 87
    iget-object v2, v0, Ll/᩶ۚ᩻;->ᩴ:Ll/۫᩸᩻;

    invoke-virtual {v2}, Ll/۫᩸᩻;->ۤ()Z

    move-result v2

    iget-object v4, v0, Ll/᩶ۚ᩻;->֫:Ljava/lang/CharSequence;

    if-eqz v2, :cond_0

    new-instance v2, Ll/ۢۚ᩻;

    invoke-direct {v2, v4}, Ll/ۢۚ᩻;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    .line 88
    invoke-virtual {v1, v2}, Ll/ۡܺۨ;->ۙ(Ll/᩻ܺۨ;)V

    .line 89
    :cond_1
    new-instance v5, Ll/᩺ۚ᩻;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v6

    invoke-direct {v5, v1, v6}, Ll/᩺ۚ᩻;-><init>(Ll/᩻ۚ᩻;I)V

    .line 90
    invoke-virtual {v5}, Ll/ۗܺۨ;->ۤ()V

    .line 91
    invoke-virtual {v1}, Ll/ܺۚ᩻;->᩹()Z

    move-result v1

    const/4 v6, 0x0

    if-eqz v1, :cond_2

    goto/16 :goto_3

    :cond_2
    const/4 v1, 0x3

    const/4 v7, 0x2

    if-eqz v2, :cond_6

    .line 93
    invoke-virtual {v5}, Ll/ۗܺۨ;->᩸()Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_3
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/۠ܺۨ;

    .line 94
    invoke-interface {v9}, Ll/۠ܺۨ;->getType()I

    move-result v10

    invoke-interface {v9}, Ll/۠ܺۨ;->᩸()I

    move-result v11

    invoke-interface {v9}, Ll/۠ܺۨ;->ᩴ()I

    move-result v9

    add-int/lit8 v12, v9, 0x1

    .line 95
    invoke-virtual {v3, v11, v12}, Ll/֡ۚ᩻;->ۙ(II)Z

    move-result v12

    if-eqz v12, :cond_4

    goto :goto_1

    :cond_4
    if-ne v10, v7, :cond_5

    add-int/lit8 v12, v9, -0x2

    const-string v13, "-->"

    .line 96
    invoke-static {v4, v6, v12, v13, v1}, Ll/ᩳۚۤ;->ۙ(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v12

    if-nez v12, :cond_5

    const-string v9, "Unterminated HTML comment"

    .line 97
    invoke-virtual {v2, v11, v9}, Ll/ۢۚ᩻;->ۙ(ILjava/lang/String;)V

    goto :goto_1

    :cond_5
    if-ne v10, v1, :cond_3

    add-int/lit8 v9, v9, -0x2

    const-string v10, "]]>"

    .line 98
    invoke-static {v4, v6, v9, v10, v1}, Ll/ᩳۚۤ;->ۙ(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v9

    if-nez v9, :cond_3

    const-string v9, "Unterminated CDATA section"

    .line 99
    invoke-virtual {v2, v11, v9}, Ll/ۢۚ᩻;->ۙ(ILjava/lang/String;)V

    goto :goto_1

    .line 103
    :cond_6
    new-instance v4, Ll/ۨۚ᩻;

    invoke-direct {v4, v5}, Ll/ۨۚ᩻;-><init>(Ll/ۗܺۨ;)V

    .line 104
    invoke-virtual {v4}, Ll/ۡܺۨ;->ۧ()V

    if-eqz v2, :cond_7

    .line 105
    invoke-virtual {v4, v2}, Ll/ۡܺۨ;->ۙ(Ll/᩻ܺۨ;)V

    .line 106
    :cond_7
    invoke-virtual {v4}, Ll/ۨۚ᩻;->ܰ()Ll/ܶۚ᩻;

    move-result-object v4

    .line 103
    const-class v5, Ll/᩹ۚ᩻;

    invoke-virtual {v4, v5}, Ll/۟ܺۨ;->ۙ(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v4

    .line 106
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩹ۚ᩻;

    .line 107
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 108
    new-instance v7, Ll/ܰۚ᩻;

    .line 322
    iget-object v8, v5, Ll/۟ܺۨ;->᩸:Ll/۠ܺۨ;

    .line 108
    invoke-interface {v8}, Ll/۠ܺۨ;->᩸()I

    move-result v8

    .line 328
    iget-object v9, v5, Ll/۟ܺۨ;->ᩴ:Ll/۠ܺۨ;

    .line 108
    invoke-interface {v9}, Ll/۠ܺۨ;->ᩴ()I

    move-result v9

    add-int/lit8 v9, v9, 0x1

    .line 322
    iget-object v10, v5, Ll/۟ܺۨ;->᩸:Ll/۠ܺۨ;

    .line 109
    invoke-interface {v10}, Ll/۠ܺۨ;->getType()I

    move-result v10

    invoke-direct {v7, v8, v9, v10}, Ll/ܰۚ᩻;-><init>(III)V

    .line 110
    iget v8, v7, Ll/ܰۚ᩻;->᩺:I

    iget v9, v7, Ll/ܰۚ᩻;->ۛ:I

    invoke-virtual {v3, v9, v8}, Ll/֡ۚ᩻;->ۙ(II)Z

    move-result v8

    iput-boolean v8, v7, Ll/ܰۚ᩻;->ܶ:Z

    .line 153
    const-class v8, Ll/ۗۚ᩻;

    invoke-virtual {v5, v8, v6}, Ll/۟ܺۨ;->ۙ(Ljava/lang/Class;I)Ll/۟ܺۨ;

    move-result-object v5

    check-cast v5, Ll/ۗۚ᩻;

    if-eqz v5, :cond_28

    const/16 v8, 0xe

    .line 249
    invoke-virtual {v5, v8, v6}, Ll/۟ܺۨ;->ۙ(II)Ll/֨᩹ۨ;

    move-result-object v10

    .line 113
    invoke-interface {v10}, Ll/֨᩹ۨ;->ۙ()Ll/۠ܺۨ;

    move-result-object v10

    .line 115
    invoke-interface {v10}, Ll/۠ܺۨ;->᩸()I

    move-result v11

    invoke-interface {v10}, Ll/۠ܺۨ;->ᩴ()I

    move-result v10

    add-int/lit8 v10, v10, 0x1

    invoke-virtual {v3, v11, v10}, Ll/֡ۚ᩻;->ۙ(II)Z

    move-result v10

    if-eqz v10, :cond_8

    :goto_3
    return v6

    .line 249
    :cond_8
    invoke-virtual {v5, v8, v6}, Ll/۟ܺۨ;->ۙ(II)Ll/֨᩹ۨ;

    move-result-object v10

    .line 116
    invoke-interface {v10}, Ll/ᩳ᩹ۨ;->getText()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ll/ܺۚ᩻;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    iput-object v10, v7, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    .line 249
    invoke-virtual {v5, v8, v6}, Ll/۟ܺۨ;->ۙ(II)Ll/֨᩹ۨ;

    move-result-object v10

    .line 117
    invoke-interface {v10}, Ll/ᩳ᩹ۨ;->getText()Ljava/lang/String;

    move-result-object v10

    iput-object v10, v7, Ll/ܰۚ᩻;->ܺ:Ljava/lang/String;

    const/4 v10, 0x6

    .line 251
    invoke-virtual {v5, v10, v6}, Ll/۟ܺۨ;->ۙ(II)Ll/֨᩹ۨ;

    move-result-object v10

    if-eqz v10, :cond_9

    const/4 v10, 0x1

    goto :goto_4

    :cond_9
    const/4 v10, 0x0

    .line 118
    :goto_4
    iput-boolean v10, v7, Ll/ܰۚ᩻;->ۤ:Z

    const/16 v10, 0xa

    .line 259
    invoke-virtual {v5, v10, v6}, Ll/۟ܺۨ;->ۙ(II)Ll/֨᩹ۨ;

    move-result-object v10

    if-eqz v10, :cond_a

    const/4 v10, 0x1

    goto :goto_5

    :cond_a
    const/4 v10, 0x0

    .line 119
    :goto_5
    iput-boolean v10, v7, Ll/ܰۚ᩻;->ۨ:Z

    const/16 v10, 0xb

    .line 258
    invoke-virtual {v5, v10, v6}, Ll/۟ܺۨ;->ۙ(II)Ll/֨᩹ۨ;

    move-result-object v10

    if-nez v10, :cond_c

    .line 120
    iget-boolean v10, v7, Ll/ܰۚ᩻;->ۨ:Z

    if-eqz v10, :cond_b

    goto :goto_6

    :cond_b
    const/4 v10, 0x0

    goto :goto_7

    :cond_c
    :goto_6
    const/4 v10, 0x1

    :goto_7
    iput-boolean v10, v7, Ll/ܰۚ᩻;->᩸:Z

    .line 121
    iput-boolean v10, v7, Ll/ܰۚ᩻;->᩶:Z

    if-nez v10, :cond_d

    const-string v10, "Unclosed HTML tag"

    .line 122
    invoke-direct {v0, v7, v9, v10}, Ll/᩶ۚ᩻;->ۙ(Ll/ܰۚ᩻;ILjava/lang/String;)V

    .line 253
    :cond_d
    const-class v10, Ll/᩵ۚ᩻;

    invoke-virtual {v5, v10}, Ll/۟ܺۨ;->ۙ(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v5

    .line 123
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    iget-object v11, v7, Ll/ܰۚ᩻;->ۙ:Ljava/util/ArrayList;

    if-eqz v10, :cond_25

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩵ۚ᩻;

    .line 333
    const-class v12, Ll/ܽۚ᩻;

    invoke-virtual {v10, v12, v6}, Ll/۟ܺۨ;->ۙ(Ljava/lang/Class;I)Ll/۟ܺۨ;

    move-result-object v12

    check-cast v12, Ll/ܽۚ᩻;

    .line 322
    iget-object v13, v10, Ll/۟ܺۨ;->᩸:Ll/۠ܺۨ;

    .line 125
    invoke-interface {v13}, Ll/۠ܺۨ;->᩸()I

    move-result v13

    .line 328
    iget-object v15, v10, Ll/۟ܺۨ;->ᩴ:Ll/۠ܺۨ;

    .line 125
    invoke-interface {v15}, Ll/۠ܺۨ;->ᩴ()I

    move-result v15

    add-int/lit8 v15, v15, 0x1

    invoke-virtual {v3, v13, v15}, Ll/֡ۚ᩻;->ۙ(II)Z

    move-result v13

    const/16 v15, 0x13

    if-eqz v13, :cond_15

    .line 127
    iget-boolean v13, v7, Ll/ܰۚ᩻;->᩹:Z

    if-eqz v12, :cond_13

    .line 461
    invoke-virtual {v12, v15, v6}, Ll/۟ܺۨ;->ۙ(II)Ll/֨᩹ۨ;

    move-result-object v15

    if-eqz v15, :cond_13

    .line 451
    invoke-virtual {v12, v8, v6}, Ll/۟ܺۨ;->ۙ(II)Ll/֨᩹ۨ;

    move-result-object v15

    .line 128
    invoke-interface {v15}, Ll/֨᩹ۨ;->ۙ()Ll/۠ܺۨ;

    move-result-object v15

    const/16 v16, 0x2

    invoke-interface {v15}, Ll/۠ܺۨ;->᩸()I

    move-result v15

    .line 451
    invoke-virtual {v12, v8, v6}, Ll/۟ܺۨ;->ۙ(II)Ll/֨᩹ۨ;

    move-result-object v17

    .line 129
    invoke-interface/range {v17 .. v17}, Ll/֨᩹ۨ;->ۙ()Ll/۠ܺۨ;

    move-result-object v17

    invoke-interface/range {v17 .. v17}, Ll/۠ܺۨ;->ᩴ()I

    move-result v17

    add-int/lit8 v14, v17, 0x1

    .line 128
    invoke-virtual {v3, v15, v14}, Ll/֡ۚ᩻;->ۙ(II)Z

    move-result v14

    if-nez v14, :cond_13

    iget-object v14, v7, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    .line 451
    invoke-virtual {v12, v8, v6}, Ll/۟ܺۨ;->ۙ(II)Ll/֨᩹ۨ;

    move-result-object v6

    .line 130
    invoke-interface {v6}, Ll/ᩳ᩹ۨ;->getText()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/ܺۚ᩻;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "style"

    .line 172
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_13

    const-string v15, "xml:space"

    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_13

    const-string v15, "xmlns"

    .line 173
    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_13

    const-string v15, "xmlns:"

    invoke-virtual {v6, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_13

    const-string v15, "script"

    .line 174
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    move-object/from16 v19, v3

    const-string v3, "type"

    if-eqz v15, :cond_10

    .line 0
    new-array v15, v1, [Ljava/lang/Object;

    const/16 v17, 0x0

    aput-object v3, v15, v17

    const-string v17, "language"

    const/16 v18, 0x1

    aput-object v17, v15, v18

    const-string v17, "src"

    aput-object v17, v15, v16

    move-object/from16 v16, v4

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v1}, Ljava/util/HashSet;-><init>(I)V

    const/16 v17, 0x0

    move-object/from16 v17, v5

    const/4 v5, 0x0

    :goto_9
    if-ge v5, v1, :cond_f

    aget-object v1, v15, v5

    invoke-static {v1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_e

    add-int/lit8 v5, v5, 0x1

    const/4 v1, 0x3

    goto :goto_9

    :cond_e
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "duplicate element: "

    invoke-static {v3, v1}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_f
    invoke-static {v4}, Ll/ۙۚۗ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    .line 174
    invoke-interface {v1, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    goto :goto_a

    :cond_10
    move-object/from16 v16, v4

    move-object/from16 v17, v5

    .line 175
    :goto_a
    invoke-virtual {v14, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    :cond_11
    const-string v1, "annotation-xml"

    .line 176
    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    const-string v1, "encoding"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_b

    :cond_12
    const/4 v1, 0x0

    goto :goto_c

    :cond_13
    move-object/from16 v19, v3

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    :cond_14
    :goto_b
    const/4 v1, 0x1

    :goto_c
    or-int/2addr v1, v13

    .line 130
    iput-boolean v1, v7, Ll/ܰۚ᩻;->᩹:Z

    goto :goto_d

    :cond_15
    move-object/from16 v19, v3

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    :goto_d
    if-nez v12, :cond_16

    const/16 v1, 0xc

    const/4 v3, 0x0

    .line 335
    invoke-virtual {v10, v1, v3}, Ll/۟ܺۨ;->ۙ(II)Ll/֨᩹ۨ;

    move-result-object v1

    if-nez v1, :cond_24

    .line 134
    iput-boolean v3, v7, Ll/ܰۚ᩻;->᩶:Z

    .line 322
    iget-object v1, v10, Ll/۟ܺۨ;->᩸:Ll/۠ܺۨ;

    .line 135
    invoke-interface {v1}, Ll/۠ܺۨ;->᩸()I

    move-result v1

    const-string v3, "Invalid HTML attribute"

    invoke-direct {v0, v7, v1, v3}, Ll/᩶ۚ᩻;->ۙ(Ll/ܰۚ᩻;ILjava/lang/String;)V

    goto/16 :goto_13

    :cond_16
    const/16 v1, 0xe

    const/4 v3, 0x0

    .line 451
    invoke-virtual {v12, v1, v3}, Ll/۟ܺۨ;->ۙ(II)Ll/֨᩹ۨ;

    move-result-object v1

    .line 139
    invoke-interface {v1}, Ll/ᩳ᩹ۨ;->getText()Ljava/lang/String;

    move-result-object v1

    const/16 v4, 0x13

    .line 461
    invoke-virtual {v12, v4, v3}, Ll/۟ܺۨ;->ۙ(II)Ll/֨᩹ۨ;

    move-result-object v5

    if-eqz v5, :cond_17

    invoke-virtual {v12, v4, v3}, Ll/۟ܺۨ;->ۙ(II)Ll/֨᩹ۨ;

    move-result-object v4

    .line 140
    invoke-interface {v4}, Ll/ᩳ᩹ۨ;->getText()Ljava/lang/String;

    move-result-object v4

    goto :goto_e

    :cond_17
    const/16 v4, 0x14

    .line 462
    invoke-virtual {v12, v4, v3}, Ll/۟ܺۨ;->ۙ(II)Ll/֨᩹ۨ;

    move-result-object v5

    if-eqz v5, :cond_18

    invoke-virtual {v12, v4, v3}, Ll/۟ܺۨ;->ۙ(II)Ll/֨᩹ۨ;

    move-result-object v4

    .line 141
    invoke-interface {v4}, Ll/ᩳ᩹ۨ;->getText()Ljava/lang/String;

    move-result-object v4

    goto :goto_e

    :cond_18
    const/4 v4, 0x0

    :goto_e
    const/16 v5, 0xd

    .line 452
    invoke-virtual {v12, v5, v3}, Ll/۟ܺۨ;->ۙ(II)Ll/֨᩹ۨ;

    move-result-object v3

    if-eqz v3, :cond_19

    const/4 v3, 0x1

    goto :goto_f

    :cond_19
    const/4 v3, 0x0

    :goto_f
    if-eqz v3, :cond_1a

    if-nez v4, :cond_1a

    .line 322
    iget-object v5, v12, Ll/۟ܺۨ;->᩸:Ll/۠ܺۨ;

    .line 143
    invoke-interface {v5}, Ll/۠ܺۨ;->᩸()I

    move-result v5

    const-string v6, "Missing HTML attribute value"

    invoke-direct {v0, v7, v5, v6}, Ll/᩶ۚ᩻;->ۙ(Ll/ܰۚ᩻;ILjava/lang/String;)V

    :cond_1a
    if-eqz v3, :cond_1b

    if-eqz v4, :cond_1d

    :cond_1b
    const/16 v5, 0x7b

    .line 144
    invoke-virtual {v1, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-gez v5, :cond_1d

    const/16 v5, 0x25

    invoke-virtual {v1, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-ltz v5, :cond_1c

    goto :goto_10

    :cond_1c
    const/4 v5, 0x0

    goto :goto_11

    :cond_1d
    :goto_10
    const/4 v5, 0x0

    iput-boolean v5, v7, Ll/ܰۚ᩻;->᩶:Z

    :goto_11
    const/16 v6, 0x22

    const/16 v8, 0x27

    if-eqz v4, :cond_20

    .line 145
    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-eq v10, v8, :cond_1e

    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-ne v10, v6, :cond_20

    .line 146
    :cond_1e
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v10

    const/4 v13, 0x2

    if-lt v10, v13, :cond_1f

    const/4 v10, 0x1

    .line 0
    invoke-static {v10, v4}, Ll/᩷᩶᩻;->ۙ(ILjava/lang/String;)C

    move-result v10

    .line 146
    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-eq v10, v13, :cond_20

    .line 322
    :cond_1f
    iget-object v10, v12, Ll/۟ܺۨ;->᩸:Ll/۠ܺۨ;

    .line 147
    invoke-interface {v10}, Ll/۠ܺۨ;->᩸()I

    move-result v10

    const-string v12, "Unterminated HTML attribute value"

    invoke-direct {v0, v7, v10, v12}, Ll/᩶ۚ᩻;->ۙ(Ll/ܰۚ᩻;ILjava/lang/String;)V

    .line 148
    iput-boolean v5, v7, Ll/ܰۚ᩻;->᩶:Z

    .line 150
    :cond_20
    new-instance v5, Ll/ۛۚ᩻;

    invoke-direct {v5, v1, v4, v3}, Ll/ۛۚ᩻;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    invoke-static {v1}, Ll/ܺۚ᩻;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v4, :cond_21

    const-string v4, ""

    goto :goto_12

    .line 504
    :cond_21
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v5, 0x1

    if-le v3, v5, :cond_23

    const/4 v3, 0x0

    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-eq v10, v8, :cond_22

    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-ne v8, v6, :cond_23

    .line 0
    :cond_22
    invoke-static {v5, v4}, Ll/᩷᩶᩻;->ۙ(ILjava/lang/String;)C

    move-result v6

    .line 505
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v6, v3, :cond_23

    .line 0
    invoke-static {v5, v5, v4}, Ll/֨᩵ᩴ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 152
    :cond_23
    :goto_12
    iget-object v3, v7, Ll/ܰۚ᩻;->ܿ:Ljava/util/HashMap;

    invoke-static {v3, v1, v4}, Ll/ۧۚۗ;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_24
    :goto_13
    const/4 v1, 0x3

    const/4 v6, 0x0

    const/16 v8, 0xe

    move-object/from16 v4, v16

    move-object/from16 v5, v17

    move-object/from16 v3, v19

    goto/16 :goto_8

    :cond_25
    move-object/from16 v19, v3

    move-object/from16 v16, v4

    .line 154
    iget-boolean v1, v7, Ll/ܰۚ᩻;->ۤ:Z

    if-eqz v1, :cond_27

    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_26

    iget-boolean v1, v7, Ll/ܰۚ᩻;->ۨ:Z

    if-eqz v1, :cond_27

    :cond_26
    const-string v1, "Invalid HTML closing tag"

    .line 155
    invoke-direct {v0, v7, v9, v1}, Ll/᩶ۚ᩻;->ۙ(Ll/ܰۚ᩻;ILjava/lang/String;)V

    const/4 v1, 0x0

    .line 156
    iput-boolean v1, v7, Ll/ܰۚ᩻;->᩶:Z

    .line 158
    :cond_27
    iget-boolean v1, v7, Ll/ܰۚ᩻;->ܶ:Z

    if-eqz v1, :cond_29

    iget-boolean v1, v7, Ll/ܰۚ᩻;->᩶:Z

    if-nez v1, :cond_29

    const/4 v1, 0x1

    iput-boolean v1, v7, Ll/ܰۚ᩻;->᩹:Z

    goto :goto_14

    :cond_28
    move-object/from16 v19, v3

    move-object/from16 v16, v4

    .line 160
    :cond_29
    :goto_14
    iget-object v1, v0, Ll/᩶ۚ᩻;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x3

    const/4 v6, 0x0

    move-object/from16 v4, v16

    move-object/from16 v3, v19

    goto/16 :goto_2

    :cond_2a
    const/4 v1, 0x1

    if-eqz v2, :cond_2b

    .line 162
    invoke-virtual {v2}, Ll/ۢۚ᩻;->᩷()V

    :cond_2b
    return v1
.end method
