.class public final Ll/۬֫᩵;
.super Ljava/lang/Object;
.source "EIWH"


# static fields
.field public static final ۙ:Ljava/util/HashSet;

.field public static final ۤ:Ljava/util/regex/Pattern;

.field public static final ᩷:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 55

    const-string v0, "\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*"

    .line 13
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/۬֫᩵;->ۤ:Ljava/util/regex/Pattern;

    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\\.)*"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/۬֫᩵;->᩷:Ljava/util/regex/Pattern;

    .line 19
    new-instance v0, Ljava/util/HashSet;

    const-string v53, "volatile"

    const-string v54, "while"

    const-string v1, "_"

    const-string v2, "abstract"

    const-string v3, "assert"

    const-string v4, "boolean"

    const-string v5, "break"

    const-string v6, "byte"

    const-string v7, "case"

    const-string v8, "catch"

    const-string v9, "char"

    const-string v10, "class"

    const-string v11, "const"

    const-string v12, "continue"

    const-string v13, "default"

    const-string v14, "do"

    const-string v15, "double"

    const-string v16, "else"

    const-string v17, "enum"

    const-string v18, "extends"

    const-string v19, "false"

    const-string v20, "final"

    const-string v21, "finally"

    const-string v22, "float"

    const-string v23, "for"

    const-string v24, "goto"

    const-string v25, "if"

    const-string v26, "implements"

    const-string v27, "import"

    const-string v28, "instanceof"

    const-string v29, "int"

    const-string v30, "interface"

    const-string v31, "long"

    const-string v32, "native"

    const-string v33, "new"

    const-string v34, "null"

    const-string v35, "package"

    const-string v36, "private"

    const-string v37, "protected"

    const-string v38, "public"

    const-string v39, "return"

    const-string v40, "short"

    const-string v41, "static"

    const-string v42, "strictfp"

    const-string v43, "super"

    const-string v44, "switch"

    const-string v45, "synchronized"

    const-string v46, "this"

    const-string v47, "throw"

    const-string v48, "throws"

    const-string v49, "transient"

    const-string v50, "true"

    const-string v51, "try"

    const-string v52, "void"

    filled-new-array/range {v1 .. v54}, [Ljava/lang/String;

    move-result-object v1

    .line 20
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Ll/۬֫᩵;->ۙ:Ljava/util/HashSet;

    return-void
.end method

.method public static ۙ(Ljava/lang/String;)Z
    .locals 5

    .line 81
    sget v0, Ll/ۨۧ᩵;->᩷:I

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    .line 266
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 77
    sget-object v1, Ll/۬֫᩵;->ۙ:Ljava/util/HashSet;

    invoke-virtual {v1, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 82
    sget-object v1, Ll/۬֫᩵;->ۤ:Ljava/util/regex/Pattern;

    .line 83
    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 124
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 127
    invoke-virtual {p0, v2}, Ljava/lang/String;->codePointAt(I)I

    move-result v3

    const/16 v4, 0x20

    if-gt v4, v3, :cond_0

    const/16 v4, 0x7e

    if-gt v3, v4, :cond_0

    .line 131
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    return v0
.end method

.method public static ۤ(Ljava/lang/String;)Z
    .locals 1

    .line 81
    sget v0, Ll/ۨۧ᩵;->᩷:I

    if-eqz p0, :cond_0

    .line 266
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 77
    sget-object v0, Ll/۬֫᩵;->ۙ:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 82
    sget-object v0, Ll/۬֫᩵;->ۤ:Ljava/util/regex/Pattern;

    .line 83
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ᩷(Ljava/lang/String;)Z
    .locals 1

    .line 87
    sget v0, Ll/ۨۧ᩵;->᩷:I

    if-eqz p0, :cond_0

    .line 266
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 77
    sget-object v0, Ll/۬֫᩵;->ۙ:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 88
    sget-object v0, Ll/۬֫᩵;->᩷:Ljava/util/regex/Pattern;

    .line 89
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
