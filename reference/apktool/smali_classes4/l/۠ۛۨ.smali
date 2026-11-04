.class public final Ll/۠ۛۨ;
.super Ll/ۘۛۨ;
.source "P5J2"


# static fields
.field public static final ܳ:Ljava/util/regex/Pattern;


# instance fields
.field public final ᩴ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "^total \\d+$"

    .line 55
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/۠ۛۨ;->ܳ:Ljava/util/regex/Pattern;

    .line 65
    new-instance v0, Ll/ۧۛۨ;

    return-void
.end method

.method public constructor <init>(Ll/ۧۛۨ;Z)V
    .locals 1

    const-string v0, "([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s*(\\d+)\\s+(?:(\\S+(?:\\s\\S+)*?)\\s+)?(?:(\\S+(?:\\s\\S+)*)\\s+)?(\\d+(?:,\\s*\\d+)?)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3})|(?:\\d{1,2}\u6708\\s+\\d{1,2}\u65e5)|(?:\\d{1,2}\u6708\\s+\\d{1,2}))\\s+((?:\\d+(?::\\d+)?)|(?:\\d{4}\u5e74))\\s(.*)"

    .line 153
    invoke-direct {p0, v0}, Ll/ۘۛۨ;-><init>(Ljava/lang/String;)V

    .line 154
    invoke-virtual {p0, p1}, Ll/ۘۛۨ;->ۙ(Ll/ۧۛۨ;)V

    .line 155
    iput-boolean p2, p0, Ll/۠ۛۨ;->ᩴ:Z

    return-void
.end method

.method public static synthetic ᩴ(Ljava/lang/String;)Z
    .locals 1

    .line 281
    sget-object v0, Ll/۠ۛۨ;->ܳ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final ۙ(Ljava/util/LinkedList;)Ljava/util/List;
    .locals 2

    .line 281
    new-instance v0, Ll/۬۫ۘ;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ll/۬۫ۘ;-><init>(I)V

    invoke-static {p1, v0}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    return-object p1
.end method

.method public final ۙ()Ll/ۧۛۨ;
    .locals 4

    .line 165
    new-instance v0, Ll/ۧۛۨ;

    const-string v1, "MMM d yyyy"

    const-string v2, "MMM d HH:mm"

    const-string v3, "UNIX"

    invoke-direct {v0, v3, v1, v2}, Ll/ۧۛۨ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۙ(Ljava/lang/String;)Ll/ܽۛۨ;
    .locals 14

    const-string v0, "\u6708"

    .line 178
    new-instance v1, Ll/ܽۛۨ;

    invoke-direct {v1}, Ll/ܽۛۨ;-><init>()V

    .line 179
    invoke-virtual {v1, p1}, Ll/ܽۛۨ;->᩸(Ljava/lang/String;)V

    .line 182
    invoke-virtual {p0, p1}, Ll/ۘۛۨ;->᩷(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_a

    const/4 p1, 0x1

    .line 183
    invoke-virtual {p0, p1}, Ll/ۘۛۨ;->ۙ(I)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xf

    .line 184
    invoke-virtual {p0, v3}, Ll/ۘۛۨ;->ۙ(I)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x10

    .line 185
    invoke-virtual {p0, v4}, Ll/ۘۛۨ;->ۙ(I)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x11

    .line 186
    invoke-virtual {p0, v5}, Ll/ۘۛۨ;->ۙ(I)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x12

    .line 187
    invoke-virtual {p0, v6}, Ll/ۘۛۨ;->ۙ(I)Ljava/lang/String;

    move-result-object v6

    .line 188
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v8, 0x13

    invoke-virtual {p0, v8}, Ll/ۘۛۨ;->ۙ(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " "

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v9, 0x14

    invoke-virtual {p0, v9}, Ll/ۘۛۨ;->ۙ(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v9, 0x15

    .line 189
    invoke-virtual {p0, v9}, Ll/ۘۛۨ;->ۙ(I)Ljava/lang/String;

    move-result-object v9

    .line 190
    iget-boolean v10, p0, Ll/۠ۛۨ;->ᩴ:Z

    if-eqz v10, :cond_0

    const-string v10, "^\\s+"

    const-string v11, ""

    .line 191
    invoke-virtual {v9, v10, v11}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 194
    :cond_0
    :try_start_0
    invoke-virtual {p0, v8}, Ll/ۘۛۨ;->ۙ(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v11, "UNIX"

    const-string v12, "\u65e5"

    if-eqz v10, :cond_1

    :try_start_1
    invoke-virtual {p0, v8}, Ll/ۘۛۨ;->ۙ(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_1

    .line 195
    new-instance v0, Ll/᩶ۛۨ;

    invoke-direct {v0}, Ll/᩶ۛۨ;-><init>()V

    .line 196
    new-instance v8, Ll/ۧۛۨ;

    const-string v10, "M\'\u6708\' d\'\u65e5\' yyyy\'\u5e74\'"

    const-string v12, "M\'\u6708\' d\'\u65e5\' HH:mm"

    invoke-direct {v8, v11, v10, v12}, Ll/ۧۛۨ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ll/᩶ۛۨ;->ۙ(Ll/ۧۛۨ;)V

    .line 197
    invoke-virtual {v0, v7}, Ll/᩶ۛۨ;->ۙ(Ljava/lang/String;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ܽۛۨ;->ۙ(Ljava/util/Calendar;)V

    goto :goto_0

    .line 198
    :cond_1
    invoke-virtual {p0, v8}, Ll/ۘۛۨ;->ۙ(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v8}, Ll/ۘۛۨ;->ۙ(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 199
    new-instance v0, Ll/᩶ۛۨ;

    invoke-direct {v0}, Ll/᩶ۛۨ;-><init>()V

    .line 200
    new-instance v8, Ll/ۧۛۨ;

    const-string v10, "M\'\u6708\' d yyyy"

    const-string v12, "M\'\u6708\' d HH:mm"

    invoke-direct {v8, v11, v10, v12}, Ll/ۧۛۨ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ll/᩶ۛۨ;->ۙ(Ll/ۧۛۨ;)V

    .line 201
    invoke-virtual {v0, v7}, Ll/᩶ۛۨ;->ۙ(Ljava/lang/String;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ܽۛۨ;->ۙ(Ljava/util/Calendar;)V

    goto :goto_0

    .line 203
    :cond_2
    invoke-virtual {p0, v7}, Ll/ۘۛۨ;->ۤ(Ljava/lang/String;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ܽۛۨ;->ۙ(Ljava/util/Calendar;)V
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    nop

    :goto_0
    const/4 v0, 0x0

    .line 211
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v7, 0x2d

    const/4 v8, 0x3

    const/4 v10, 0x2

    if-eq v2, v7, :cond_4

    const/16 v7, 0x6c

    if-eq v2, v7, :cond_3

    packed-switch v2, :pswitch_data_0

    const/4 v2, 0x3

    goto :goto_1

    :pswitch_0
    const/4 v2, 0x1

    goto :goto_1

    :pswitch_1
    const/4 v2, 0x0

    const/4 v7, 0x1

    goto :goto_2

    :cond_3
    :pswitch_2
    const/4 v2, 0x2

    goto :goto_1

    :cond_4
    :pswitch_3
    const/4 v2, 0x0

    :goto_1
    const/4 v7, 0x0

    .line 233
    :goto_2
    invoke-virtual {v1, v2}, Ll/ܽۛۨ;->ۙ(I)V

    const/4 v11, 0x0

    const/4 v12, 0x4

    :goto_3
    if-ge v11, v8, :cond_6

    .line 237
    invoke-virtual {p0, v12}, Ll/ۘۛۨ;->ۙ(I)Ljava/lang/String;

    move-result-object v8

    const-string v13, "-"

    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    xor-int/2addr v8, p1

    invoke-virtual {v1, v11, v0, v8}, Ll/ܽۛۨ;->ۙ(IIZ)V

    add-int/lit8 v8, v12, 0x1

    .line 238
    invoke-virtual {p0, v8}, Ll/ۘۛۨ;->ۙ(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    xor-int/2addr v8, p1

    invoke-virtual {v1, v11, p1, v8}, Ll/ܽۛۨ;->ۙ(IIZ)V

    add-int/lit8 v8, v12, 0x2

    .line 239
    invoke-virtual {p0, v8}, Ll/ۘۛۨ;->ۙ(I)Ljava/lang/String;

    move-result-object v8

    .line 240
    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5

    invoke-virtual {v8, v0}, Ljava/lang/String;->charAt(I)C

    move-result v8

    invoke-static {v8}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v8

    if-nez v8, :cond_5

    const/4 v8, 0x1

    goto :goto_4

    :cond_5
    const/4 v8, 0x0

    :goto_4
    invoke-virtual {v1, v11, v10, v8}, Ll/ܽۛۨ;->ۙ(IIZ)V

    add-int/lit8 v11, v11, 0x1

    add-int/lit8 v12, v12, 0x4

    const/4 v8, 0x3

    goto :goto_3

    :cond_6
    if-nez v7, :cond_7

    .line 244
    :try_start_2
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 249
    :catch_1
    :cond_7
    invoke-virtual {v1, v4}, Ll/ܽۛۨ;->ᩴ(Ljava/lang/String;)V

    .line 250
    invoke-virtual {v1, v5}, Ll/ܽۛۨ;->ۙ(Ljava/lang/String;)V

    .line 252
    :try_start_3
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Ll/ܽۛۨ;->ۙ(J)V
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_5

    :catch_2
    nop

    :goto_5
    if-ne v2, v10, :cond_9

    const-string p1, " -> "

    .line 259
    invoke-virtual {v9, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    const/4 v2, -0x1

    if-ne p1, v2, :cond_8

    .line 262
    invoke-virtual {v1, v9}, Ll/ܽۛۨ;->ۤ(Ljava/lang/String;)V

    goto :goto_6

    .line 264
    :cond_8
    invoke-virtual {v9, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ܽۛۨ;->ۤ(Ljava/lang/String;)V

    add-int/lit8 p1, p1, 0x4

    .line 265
    invoke-virtual {v9, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ܽۛۨ;->᩷(Ljava/lang/String;)V

    goto :goto_6

    .line 268
    :cond_9
    invoke-virtual {v1, v9}, Ll/ܽۛۨ;->ۤ(Ljava/lang/String;)V

    :goto_6
    return-object v1

    :cond_a
    const/4 p1, 0x0

    return-object p1

    :pswitch_data_0
    .packed-switch 0x62
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
