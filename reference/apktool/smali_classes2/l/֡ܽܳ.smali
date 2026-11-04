.class public final Ll/֡ܽܳ;
.super Ljava/lang/Object;
.source "MIVV"


# instance fields
.field public final ۙ:Landroid/content/Context;

.field public final ۤ:Ljava/util/LinkedList;

.field public ᩷:Ll/ܿܽܳ;

.field public ᩸:Z


# direct methods
.method public constructor <init>(Ll/ܽܿ֫;)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ll/֡ܽܳ;->ۤ:Ljava/util/LinkedList;

    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Ll/֡ܽܳ;->᩸:Z

    .line 27
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ll/֡ܽܳ;->ۙ:Landroid/content/Context;

    return-void
.end method

.method private ۙ(Landroid/content/pm/ActivityInfo;)Ljava/lang/String;
    .locals 2

    .line 58
    iget-object v0, p0, Ll/֡ܽܳ;->ۙ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 59
    invoke-virtual {p1, v0}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 60
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 63
    :cond_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 61
    :cond_1
    :goto_0
    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-direct {p0, p1}, Ll/֡ܽܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 67
    iget-object v0, p0, Ll/֡ܽܳ;->ۙ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    .line 69
    :try_start_0
    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    .line 70
    invoke-virtual {p1, v0}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string p1, "null"

    return-object p1
.end method


# virtual methods
.method public final ۙ()V
    .locals 2

    .line 44
    iget-object v0, p0, Ll/֡ܽܳ;->ۤ:Ljava/util/LinkedList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll/֡ܽܳ;->ۤ:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->clear()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Ll/֡ܽܳ;->᩷:Ll/ܿܽܳ;

    return-void

    :catchall_0
    move-exception v1

    .line 44
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ۙ(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 18

    move-object/from16 v1, p0

    .line 87
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/16 v2, 0x20

    const/4 v3, 0x0

    if-ne v0, v2, :cond_12

    .line 88
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityRecord;->getClassName()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityEvent;->getPackageName()Ljava/lang/CharSequence;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_9

    .line 91
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityRecord;->getClassName()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 92
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityEvent;->getPackageName()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    .line 95
    iget-object v4, v1, Ll/֡ܽܳ;->ۙ:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 96
    iget-boolean v5, v1, Ll/֡ܽܳ;->᩸:Z

    if-eqz v5, :cond_1

    goto/16 :goto_9

    .line 99
    :cond_1
    iget-boolean v5, v1, Ll/֡ܽܳ;->᩸:Z

    if-nez v5, :cond_2

    .line 152
    iget-object v5, v1, Ll/֡ܽܳ;->᩷:Ll/ܿܽܳ;

    if-eqz v5, :cond_2

    iget-object v5, v5, Ll/ܿܽܳ;->ۤ:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v5, v1, Ll/֡ܽܳ;->᩷:Ll/ܿܽܳ;

    iget-object v5, v5, Ll/ܿܽܳ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    return v3

    .line 50
    :cond_2
    :try_start_0
    new-instance v5, Landroid/content/ComponentName;

    invoke-direct {v5, v2, v0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    iget-object v6, v1, Ll/֡ܽܳ;->ۙ:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    invoke-virtual {v6, v5, v3}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v3
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v4, :cond_5

    if-nez v3, :cond_3

    goto/16 :goto_9

    .line 106
    :cond_3
    iget-object v5, v3, Landroid/content/pm/ActivityInfo;->targetActivity:Ljava/lang/String;

    if-nez v5, :cond_4

    iget-object v5, v3, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 107
    :cond_4
    const-class v6, Ll/۫ܺܳ;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    goto/16 :goto_9

    :cond_5
    if-nez v3, :cond_e

    const-string v5, "/"

    const-string v6, " "

    .line 156
    invoke-static {}, Ll/۟۠ۧ;->ᩴ()Ll/᩻۠ۧ;

    move-result-object v7

    if-eqz v7, :cond_b

    .line 157
    invoke-interface {v7}, Ll/᩻۠ۧ;->᩷()Z

    move-result v8

    if-eqz v8, :cond_b

    const-string v8, "dumpsys activity activities"

    const-wide/16 v9, 0x258

    .line 158
    invoke-interface {v7, v9, v10, v8}, Ll/᩻۠ۧ;->ۙ(JLjava/lang/String;)Ll/ۧ۠ۧ;

    move-result-object v7

    .line 74
    iget-object v8, v7, Ll/ۧ۠ۧ;->ۙ:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_b

    .line 161
    iget-object v7, v7, Ll/ۧ۠ۧ;->᩷:[Ljava/lang/String;

    array-length v8, v7

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_1
    if-ge v9, v8, :cond_b

    aget-object v11, v7, v9

    if-nez v10, :cond_6

    const-string v12, "Running activities"

    .line 163
    invoke-virtual {v11, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/4 v10, 0x1

    goto :goto_3

    :cond_6
    const-string v12, "ActivityRecord"

    .line 167
    invoke-virtual {v11, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_9

    .line 168
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_a

    .line 169
    invoke-virtual {v11, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    array-length v12, v11

    const/4 v13, 0x0

    :goto_2
    if-ge v13, v12, :cond_a

    aget-object v15, v11, v13

    const/16 v16, 0x0

    const-string v14, "/"

    .line 170
    invoke-virtual {v2, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v15, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_8

    .line 171
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v15, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "."

    .line 172
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 173
    invoke-virtual {v2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :cond_7
    const/4 v14, 0x1

    goto :goto_5

    :cond_8
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    :cond_9
    const/4 v12, 0x1

    const/4 v13, 0x0

    .line 179
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_a

    goto :goto_4

    :cond_a
    :goto_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_b
    const/4 v5, 0x1

    const/4 v6, 0x0

    :goto_4
    const/4 v14, 0x1

    const/16 v16, 0x0

    const/4 v5, 0x0

    :goto_5
    if-nez v5, :cond_c

    .line 78
    :try_start_1
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    return v16

    .line 116
    :catch_1
    invoke-direct {v1, v2}, Ll/֡ܽܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_8

    .line 50
    :cond_c
    :try_start_2
    new-instance v3, Landroid/content/ComponentName;

    invoke-direct {v3, v2, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    iget-object v6, v1, Ll/֡ܽܳ;->ۙ:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v6, v3, v7}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v3
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_6

    :catch_2
    const/4 v3, 0x0

    :goto_6
    if-nez v3, :cond_d

    .line 78
    :try_start_3
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_3

    const/4 v0, 0x0

    return v0

    .line 123
    :catch_3
    invoke-direct {v1, v2}, Ll/֡ܽܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_8

    .line 78
    :cond_d
    :try_start_4
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_7

    :catch_4
    const-string v6, " > "

    .line 0
    invoke-static {v5, v6, v0}, Ll/᩵֡ۨ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 130
    :goto_7
    invoke-direct {v1, v3}, Ll/֡ܽܳ;->ۙ(Landroid/content/pm/ActivityInfo;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v17, v5

    move-object v5, v0

    move-object/from16 v0, v17

    goto :goto_8

    :cond_e
    const/4 v14, 0x1

    .line 134
    invoke-direct {v1, v3}, Ll/֡ܽܳ;->ۙ(Landroid/content/pm/ActivityInfo;)Ljava/lang/String;

    move-result-object v5

    :goto_8
    if-nez v4, :cond_f

    if-eqz v3, :cond_f

    const/4 v3, 0x0

    .line 137
    iput-boolean v3, v1, Ll/֡ܽܳ;->᩸:Z

    .line 152
    :cond_f
    iget-object v3, v1, Ll/֡ܽܳ;->᩷:Ll/ܿܽܳ;

    if-eqz v3, :cond_10

    iget-object v3, v3, Ll/ܿܽܳ;->ۤ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    iget-object v3, v1, Ll/֡ܽܳ;->᩷:Ll/ܿܽܳ;

    iget-object v3, v3, Ll/ܿܽܳ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    const/4 v0, 0x0

    return v0

    .line 139
    :cond_10
    new-instance v3, Ll/ܿܽܳ;

    invoke-direct {v3, v5, v2, v0}, Ll/ܿܽܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    iget-object v0, v1, Ll/֡ܽܳ;->ۤ:Ljava/util/LinkedList;

    move-object/from16 v16, v0

    monitor-enter v16

    .line 141
    :try_start_5
    iget-object v0, v1, Ll/֡ܽܳ;->ۤ:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    const/16 v2, 0x1e

    if-le v0, v2, :cond_11

    .line 142
    iget-object v0, v1, Ll/֡ܽܳ;->ۤ:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    .line 143
    :cond_11
    iget-object v0, v1, Ll/֡ܽܳ;->ۤ:Ljava/util/LinkedList;

    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 144
    monitor-exit v16
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 145
    iput-object v3, v1, Ll/֡ܽܳ;->᩷:Ll/ܿܽܳ;

    return v14

    :catchall_0
    move-exception v0

    .line 144
    :try_start_6
    monitor-exit v16
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v0

    :cond_12
    :goto_9
    const/4 v0, 0x0

    return v0
.end method

.method public final ۤ()Z
    .locals 1

    .line 35
    iget-object v0, p0, Ll/֡ܽܳ;->᩷:Ll/ܿܽܳ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()Ljava/util/ArrayList;
    .locals 3

    .line 31
    iget-object v0, p0, Ll/֡ܽܳ;->ۤ:Ljava/util/LinkedList;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/֡ܽܳ;->ۤ:Ljava/util/LinkedList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩸()V
    .locals 1

    const/4 v0, 0x1

    .line 39
    iput-boolean v0, p0, Ll/֡ܽܳ;->᩸:Z

    const/4 v0, 0x0

    .line 40
    iput-object v0, p0, Ll/֡ܽܳ;->᩷:Ll/ܿܽܳ;

    return-void
.end method
